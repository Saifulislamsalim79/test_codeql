package io.intercom.android.sdk.metrics.ops;
/* loaded from: classes3.dex */
public class OpsMetricObject {

    /* renamed from: id */
    private final String f23902id;
    private final String name;
    private final String type;
    private final long value;

    public OpsMetricObject(String str, String str2, long j, String str3) {
        this.type = str;
        this.name = str2;
        this.value = j;
        this.f23902id = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OpsMetricObject.class != obj.getClass()) {
            return false;
        }
        OpsMetricObject opsMetricObject = (OpsMetricObject) obj;
        if (this.value == opsMetricObject.value && this.type.equals(opsMetricObject.type) && this.name.equals(opsMetricObject.name)) {
            return this.f23902id.equals(opsMetricObject.f23902id);
        }
        return false;
    }

    public String getId() {
        return this.f23902id;
    }

    public int hashCode() {
        long j = this.value;
        return (((((this.type.hashCode() * 31) + this.name.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f23902id.hashCode();
    }

    public String toString() {
        return "OpsMetricObject{type='" + this.type + "', name='" + this.name + "', value=" + this.value + ", id='" + this.f23902id + "'}";
    }
}
