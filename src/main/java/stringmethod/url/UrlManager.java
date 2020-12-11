package stringmethod.url;

public class UrlManager {
    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url) {
        this.protocol = getProtocolFromUrl(url);
        this.port = getPortFromUrl(url);
        this.host = getHostFromUrl(url);
        this.path = getPathFromUrl(url);
        this.query = getQueryFromUrl(url);

    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

  public String getProtocolFromUrl(String url) {
        int indexP = url.indexOf("://");
        if ( indexP == -1 || url.substring(0, indexP).isEmpty()) {
            throw new IllegalArgumentException("Invalid url");
        }
        return url.substring(0, indexP).toLowerCase();
  }
  public Integer getPortFromUrl(String url) {
        int indexPort = url.indexOf("://") + 3;
        indexPort = url.indexOf(":", indexPort);
        if ( indexPort == -1) {
            return null;
        }
        int indexPortEnd = url.indexOf("/",indexPort);
        if ( indexPortEnd == -1) {
            return Integer.valueOf(url.substring(indexPort + 1));

        }
      return Integer.valueOf(url.substring(indexPort + 1), indexPort);



  }
  public String getHostFromUrl(String url) {
        String host;
        int indexHost = url.indexOf("://");
        int indexHostEnd = url.indexOf(":", indexHost);
        if (indexHost == -1) {
            indexHostEnd = url.indexOf("/", indexHostEnd);
        }
        if (indexHostEnd == -1) {
            host = url.substring(indexHost).toLowerCase();
        } else {
            host = url.substring(indexHost, indexHostEnd).toLowerCase();
        }
        if (host.isEmpty()) {
            throw new IllegalArgumentException("Invalid url");
        }
        return host;

  }
  public String getPathFromUrl(String url) {
      int indexPath = url.indexOf("://") + 3;
      indexPath = url.indexOf("/", indexPath);
      if (indexPath == -1) {
          return "";
      }
      int indexPathEnd = url.indexOf("?");
      if (indexPathEnd == -1) {
          return url.substring(indexPath);
      }
      return url.substring(indexPath, indexPathEnd);
  }
  public String getQueryFromUrl(String url) {
        int indexQuery = url.indexOf("?");
        if ( indexQuery == -1) {
            return "";
        }
        return url.substring(indexQuery + 1);
  }
    private void validateString(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Parameter must not be empty");
        }
    }

    public String getProperty(String key) {
        validateString(key);
        String[] properties = query.split("&");
        for (String s : properties) {
            String[] p = s.split("=");
            if(p[0].equals(key) ) {
                return p[1];
            }
        }
        return null;
    }
    public boolean hasProperty(String key) {
        validateString(key);
        return query.startsWith(key + "=") || query.contains("&" + key + "=");
    }


}
