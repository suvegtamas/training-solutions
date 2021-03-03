CREATE TABLE track_point (track_id BIGINT AUTO_INCREMENT,
						 activity_id BIGINT not null,
                          track_time TIMESTAMP,
                          lat DOUBLE ,
                          lon DOUBLE,
                          PRIMARY KEY (track_id),
                          FOREIGN KEY (activity_id) REFERENCES activities(id)
            );