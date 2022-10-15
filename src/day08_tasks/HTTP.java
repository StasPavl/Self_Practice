package day08_tasks;

 class HTTP {
    public static void main(String[] args) {
        int statusCode = 201;
        String result = "";

        System.out.println("Solution 1");

        result = (statusCode == 200) ? "OK" : (statusCode == 201) ? "Created" : (statusCode == 202) ? "Acepted" : (statusCode == 301) ? "Moved Permanently"
                : (statusCode == 303) ? "See Other" : (statusCode == 304) ? "Not Modified" : (statusCode == 307) ? "Temporary Redirect"
                : (statusCode == 400) ? "Bad Request" : (statusCode == 401) ? "Unauthorized" : (statusCode == 403) ? "Forbidden"
                : (statusCode == 404) ? "Not Found" : (statusCode == 410) ? "Gone" : (statusCode == 500) ? "Internal Server Error" :
                (statusCode == 503) ? "Service Unavailable" : "Unknown Error";

        System.out.println(result);
        System.out.println("--------------------------");
        System.out.println("Solution 2");

        switch (statusCode) {
            case 200:
                result = "OK";
        break;
            case 201:
                result = "Created";
                break;
            case 202:
                result = "Acepted";
                break;
            case 301:
                result = "Moved Permanently";
                break;
            case 303:
                result = "See Other";
                break;
            case 304:
                result = "Not Modified";
                break;
            case 307:
                result = "Temporary Redirect";
                break;
            case 400:
                result = "Bad Request";
                break;
            case 401:
                result = "Unauthorized";
                break;
            case 403:
                result = "Forbidden";
                break;
            case 404:
                result = "Not Found";
                break;
            case 410:
                result = "Gone";
                break;
            case 500:
                result = "Internal Server Error";
                break;
            case 503:
                result = "Service Unavailable";
                break;
            default:
                result = "Unknown Error";

        }
        System.out.println(result);
        /*
        200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable
         */
    }
}
