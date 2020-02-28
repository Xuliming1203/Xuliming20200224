package com.bw.xuliming20200224.entity;

/**
 * 时间：2020/2/26
 * 作者：徐黎明
 * 类的作用：
 */
public class UserEntity {

    /**
     * message : 该手机号已注册，不能重复注册！
     * status : 1001
     */

    private String message;
    private String status;
    /**
     * result : {"headPic":"http://mobile.bwstudent.com/images/small/default/user.jpg","nickName":"62_btmZW","phone":"13265725544","sessionId":"158270559129028312","sex":1,"userId":28312}
     */

    private ResultBean result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * headPic : http://mobile.bwstudent.com/images/small/default/user.jpg
         * nickName : 62_btmZW
         * phone : 13265725544
         * sessionId : 158270559129028312
         * sex : 1
         * userId : 28312
         */

        private String headPic;
        private String nickName;
        private String phone;
        private String sessionId;
        private int sex;
        private int userId;

        public String getHeadPic() {
            return headPic;
        }

        public void setHeadPic(String headPic) {
            this.headPic = headPic;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getSessionId() {
            return sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }
    }
}
