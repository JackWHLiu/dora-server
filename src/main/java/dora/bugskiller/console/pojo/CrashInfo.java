package dora.bugskiller.console.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.ibatis.type.Alias;

@Alias("crash_info")
@ApiModel
public class CrashInfo {

    private Integer id;
    @ApiModelProperty("版本名称")
    private String versionName;
    @ApiModelProperty("版本号")
    private int versionCode;
    @ApiModelProperty("SDK版本号")
    private int sdkVersion;
    @ApiModelProperty("Android版本号")
    private String release;
    @ApiModelProperty("手机型号")
    private String model;
    @ApiModelProperty("手机制造商")
    private String brand;
    @ApiModelProperty("客户端抛出的异常")
    private String ex;

    public Integer getId() {
        return id;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public int getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(int sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getException() {
        return ex;
    }

    public void setException(String exception) {
        this.ex = exception;
    }
}
