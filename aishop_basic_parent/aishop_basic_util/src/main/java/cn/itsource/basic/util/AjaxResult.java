package cn.itsource.basic.util;

public class AjaxResult  {

    private Boolean success;

    private String message ;

    //错误状态码
    private Integer errorCode;

    //返回到前台对象
    private Object resultObj;

    private AjaxResult(){}

    public static AjaxResult cg(){
        return new AjaxResult().setSuccess(true).setMessage("操作成功");
    }
    public static AjaxResult diy(){
        return new AjaxResult();
    }


    public Boolean getSuccess() {
        return success;
    }


    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResultObj() {
        return resultObj;
    }

    public AjaxResult setResultObj(Object resultObj) {
        this.resultObj = resultObj;
        return this;
    }
}
