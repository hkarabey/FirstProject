package working07;

public class Http {
    public static void main(String[] args) {
    int code=200;
        String a=(code==200)?"ok":(code==201)?"created":(code==202)?"accepted":(code==301)?"moved permanently":(code==303)?"see other"
                :(code==304)?"not modified":(code==307)?"temporary redirect":(code==400)?"bad request":(code==401)?"unauthorized"
                :(code==403)?"forbiden":(code==404)?"not found":(code==410)?"gone":(code==500)?"internal server error":"service unavailable";
        System.out.println(a);

            /*200, OK
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
