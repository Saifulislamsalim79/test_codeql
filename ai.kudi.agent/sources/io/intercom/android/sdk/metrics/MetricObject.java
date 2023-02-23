package io.intercom.android.sdk.metrics;

import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.com.google.gson.s.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public class MetricObject {
    static final String KEY_ACTION = "action";
    private static final String KEY_ANDROID_INSTALLER_PACKAGE_NAME = "android_installer_package_name";
    private static final String KEY_ANDROID_IS_DEBUG_BUILD = "android_is_debug_build";
    static final String KEY_APP_VERSION = "app_version";
    static final String KEY_CONTEXT = "context";
    static final String KEY_OBJECT = "object";
    static final String KEY_OWNER = "owner";
    static final String KEY_PLACE = "place";
    static final String KEY_SDK_VERSION = "sdk_version";
    static final String KEY_USER_ID = "user_id";
    @c("created_at")
    private final long createdAt;

    /* renamed from: id */
    private final String f23901id;
    private final Map<String, Object> metadata = new HashMap();
    private final String name;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MetricObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, TimeProvider timeProvider, String str9, String str10) {
        this.name = str;
        this.createdAt = TimeUnit.MILLISECONDS.toSeconds(timeProvider.currentTimeMillis());
        this.f23901id = str3;
        this.metadata.put(KEY_ACTION, str5);
        this.metadata.put(KEY_OBJECT, str6);
        this.metadata.put(KEY_PLACE, str7);
        this.metadata.put(KEY_CONTEXT, str8);
        this.metadata.put(KEY_OWNER, str2);
        if (!str4.isEmpty()) {
            this.metadata.put(KEY_USER_ID, str4);
        }
        this.metadata.put(KEY_SDK_VERSION, str10);
        this.metadata.put(KEY_APP_VERSION, str9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MetricObject addInstallerPackageName(String str) {
        addMetaData(KEY_ANDROID_INSTALLER_PACKAGE_NAME, str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MetricObject addIsDebugBuild(boolean z) {
        addMetaData(KEY_ANDROID_IS_DEBUG_BUILD, Boolean.valueOf(z));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MetricObject addMetaData(String str, Object obj) {
        this.metadata.put(str, obj);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MetricObject.class != obj.getClass()) {
            return false;
        }
        MetricObject metricObject = (MetricObject) obj;
        if (this.createdAt == metricObject.createdAt && this.metadata.equals(metricObject.metadata)) {
            String str = this.f23901id;
            String str2 = metricObject.f23901id;
            return str != null ? str.equals(str2) : str2 == null;
        }
        return false;
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public String getId() {
        return this.f23901id;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        int hashCode = this.metadata.hashCode() * 31;
        String str = this.f23901id;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.createdAt;
        return ((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "MetricObject{metadata=" + this.metadata + ", id='" + this.f23901id + "', createdAt=" + this.createdAt + '}';
    }
}
