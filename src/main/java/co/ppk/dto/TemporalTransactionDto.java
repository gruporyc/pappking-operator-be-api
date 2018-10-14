package co.ppk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TemporalTransactionDto {
    private  String id;
    private  String phone;
    private  String license_plate;
    private  String billboards_code;
    private  String date;
    private  String hour;
    private  String time;
    private  String price;
    private  String action;
    private  String createDate;
    private  String updateDate;

    @JsonProperty("id")
    public String getId() { return id;  }
    public void setId(String id) { this.id = id; }

    @JsonProperty("phone")
    public String getPhone() { return phone;  }
    public void setPhone(String phone) { this.phone = phone;  }

    @JsonProperty("license_plate")
    public String getLicense_plate() { return license_plate;  }
    public void setLicense_plate(String license_plate) { this.license_plate = license_plate;    }

    @JsonProperty("billboards_code")
    public String getBillboard_code() { return billboards_code; }
    public void setBillboards_code(String billboards_code) { this.billboards_code = billboards_code; }

    @JsonProperty("date")
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    @JsonProperty("hour")
    public String getHour() { return hour;  }
    public void setHour(String hour) { this.hour = hour; }

    @JsonProperty("time")
    public String getTime() { return time;  }
    public void setTime(String time) { this.time = time; }

    @JsonProperty("price")
    public String getPrice() { return price;  }
    public void setPrice(String price) { this.price = price; }

    @JsonProperty("action")
    public String getAction() { return action;  }
    public void setAction(String action) { this.action = action; }

    @JsonProperty("createDate")
    public String getCreateDate() { return createDate; }
    public void setCreateDate(String createDate) { this.createDate = createDate; }

    @JsonProperty("updateDate")
    public String getUpdateDate() { return updateDate;  }
    public void setUpdateDate(String updateDate) { this.updateDate = updateDate;  }

    @Override
    public String toString() {
        return "TransactionDto{" +
                "id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", license_plate='" + license_plate + '\'' +
                ", billboards_code='" + billboards_code + '\'' +
                ", date='" + date + '\'' +
                ", hour='" + hour + '\'' +
                ", time='" + time + '\'' +
                ", price='" + price + '\'' +
                ", action='" + action + '\'' +
                ", createDate='" + createDate + '\'' +
                ", updateDate='" + updateDate + '\'' +
                '}';
    }
}
