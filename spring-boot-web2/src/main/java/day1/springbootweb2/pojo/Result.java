package day1.springbootweb2.pojo;

public class Result {
//   封装一个公共相应类
    private Integer code;
    private String msg;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public Result() {
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static Result success(Object data){
        return new Result(1,"success",data);
    }
    public static Result success(){
        return new Result(1,"success",null);
    }
    public static Result error(String msg){
        return new Result(0,msg,null);
    }
}
