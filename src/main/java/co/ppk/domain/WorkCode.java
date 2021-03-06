package co.ppk.domain;

public class WorkCode {



    private final String id;
    private final String operatorId;
    private final String billaboardId;
    private final String authorization_code;
    private final String status;
    private final String createDate;
    private final String updateDate;




    private WorkCode(
            String id,
            String operatorId,
            String billaboardId,
            String authorization_code,
            String status,
            String createDate,
            String updateDate) {
        this.id = id;
        this.operatorId = operatorId;
        this.billaboardId = billaboardId;
        this.authorization_code = authorization_code;
        this.status = status;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }


    public String getId() { return id; }
    public String getOperatorId() { return operatorId; }
    public String getBillaboardId() { return billaboardId; }
    public String getAuthorization_code() { return authorization_code; }
    public String getStatus() { return status; }
    public String getCreateDate() { return createDate; }
    public String getUpdateDate() { return updateDate; }

    public static class Builder {
        private String id;
        private String operatorId;
        private String billaboardId;
        private String authorization_code;
        private String status;
        private String createDate;
        private String updateDate;


        public WorkCode.Builder setId(String id) {
            this.id = id;
            return this;
        }

        public WorkCode.Builder setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        public WorkCode.Builder setBillaboardId(String billaboardId) {
            this.billaboardId = billaboardId;
            return this;
        }

        public WorkCode.Builder setAuthorization_code(String authorization_code) {
            this.authorization_code = authorization_code;
            return this;
        }

        public WorkCode.Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public WorkCode.Builder setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }

        public WorkCode.Builder setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }

        public WorkCode build() {
            return new WorkCode(id, operatorId, billaboardId,authorization_code, status, createDate, updateDate);
        }
    }
}
