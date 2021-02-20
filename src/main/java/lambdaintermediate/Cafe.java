package lambdaintermediate;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {

    private List<CoffeeOrder> orders;

    public Cafe(List<CoffeeOrder> orders) {
        this.orders = orders;
    }




    public List<CoffeeOrder> getOrders() {
        return orders;
    }

    public BigDecimal getTotalIncome() {
        return orders.stream().flatMap(x -> x.getCoffeeList().stream()).map(c -> c.getPrice())
                .reduce(BigDecimal.ZERO, (a, b) -> a.add(b), (x, y) -> x.add(y)).setScale(2, RoundingMode.HALF_UP);
    }
    public BigDecimal getTotalIncome(LocalDate time) {
        return orders.stream().filter(order -> order.getDateTime().toLocalDate().equals(time))
                .flatMap(x -> x.getCoffeeList().stream()).map(c -> c.getPrice())
                .reduce(BigDecimal.ZERO, (a, b) -> a.add(b), (x, y) -> x.add(y)).setScale(2, RoundingMode.HALF_UP);
    }

    public long getNumberOfCoffee(CoffeeType type) {
        return orders.stream().flatMap(x -> x.getCoffeeList().stream())
                .map(c -> c.getType())
                .filter(type::equals)
                .count();
    }


    public List<CoffeeOrder> getOrdersAfter(LocalDateTime dateTime) {
        return orders.stream().filter(c -> c.getDateTime().isAfter(dateTime)).collect(Collectors.toList());
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate localDate) {
        return orders.stream().filter(x -> x.getDateTime().toLocalDate().equals(localDate))
                .sorted((a, b) -> a.getDateTime().compareTo(b.getDateTime()))
                .limit(5)
                .collect(Collectors.toList());
    }
}
