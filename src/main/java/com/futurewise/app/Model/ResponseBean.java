package com.futurewise.app.Model;

import com.fasterxml.jackson.core.JsonProcessingException;

public class ResponseBean {

        private long timestamp;
        private int status;
        private String error;
        private String message;
        private String path;
        private Object payLoad;
        private long id;

        public ResponseBean(int status, String error, String message, String path, Object payLoad) {
            this.status = status;
            this.error = error;
            this.message = message;
            this.path = path;
            this.payLoad = payLoad;
            this.timestamp = System.currentTimeMillis();
        }

        public ResponseBean() {
            this.timestamp = System.currentTimeMillis();
        }

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        public long getid(){ return id; }

        public void setId(long id) {
            this.id = id;
        }

        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public Object getPayLoad() {
            return payLoad;
        }

        public void setPayLoad(Object payLoad) throws JsonProcessingException {
            if (payLoad == null) {
                this.payLoad = payLoad;
            } else {
                //this.payLoad = Base64.getEncoder().encode((new ObjectMapper().writeValueAsString(payLoad)));
                this.payLoad = payLoad;
            }
        }

        public void setPayLoad(Object payLoad, boolean encode) throws JsonProcessingException {
            if (payLoad == null || !encode) {
                this.payLoad = payLoad;
            } else {
                //this.payLoad = EncryptionUtil.base64Encode(new ObjectMapper().writeValueAsString(payLoad));
            }
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "ResponseBean{" +
                    "timestamp=" + timestamp +
                    ", status=" + status +
                    ", error='" + error + '\'' +
                    ", message='" + message + '\'' +
                    ", path='" + path + '\'' +
                    ", payLoad=" + payLoad +
                    '}';
        }

    }
