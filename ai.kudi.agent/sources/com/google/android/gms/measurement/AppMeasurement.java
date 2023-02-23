package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.measurement.C3919o1;
import com.google.android.gms.measurement.internal.C4430y5;
import com.google.android.gms.measurement.internal.InterfaceC4256j7;
import com.google.android.gms.measurement.internal.b5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {

    /* renamed from: b */
    private static volatile AppMeasurement f9929b;

    /* renamed from: a */
    private final AbstractC4145e f9930a;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
    /* loaded from: classes2.dex */
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            s.j(bundle);
            this.mAppId = (String) C4430y5.m27809a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) C4430y5.m27809a(bundle, "origin", String.class, null);
            this.mName = (String) C4430y5.m27809a(bundle, "name", String.class, null);
            this.mValue = C4430y5.m27809a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C4430y5.m27809a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) C4430y5.m27809a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) C4430y5.m27809a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) C4430y5.m27809a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C4430y5.m27809a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) C4430y5.m27809a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C4430y5.m27809a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) C4430y5.m27809a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) C4430y5.m27809a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) C4430y5.m27809a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C4430y5.m27809a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C4430y5.m27809a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(b5 b5Var) {
        this.f9930a = new C4142b(b5Var);
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        InterfaceC4256j7 interfaceC4256j7;
        if (f9929b == null) {
            synchronized (AppMeasurement.class) {
                if (f9929b == null) {
                    try {
                        interfaceC4256j7 = (InterfaceC4256j7) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    } catch (ClassNotFoundException | Exception unused) {
                        interfaceC4256j7 = null;
                    }
                    if (interfaceC4256j7 != null) {
                        f9929b = new AppMeasurement(interfaceC4256j7);
                    } else {
                        f9929b = new AppMeasurement(b5.H(context, new C3919o1(0L, 0L, true, null, null, null, null, null), (Long) null));
                    }
                }
            }
        }
        return f9929b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f9930a.mo25437g(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f9930a.mo25435i(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f9930a.mo25434j(str);
    }

    @Keep
    public long generateEventId() {
        return this.f9930a.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f9930a.mo25442b();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> mo25443a = this.f9930a.mo25443a(str, str2);
        ArrayList arrayList = new ArrayList(mo25443a == null ? 0 : mo25443a.size());
        for (Bundle bundle : mo25443a) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f9930a.mo25436h();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f9930a.mo25433n();
    }

    @Keep
    public String getGmpAppId() {
        return this.f9930a.mo25432o();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f9930a.mo25439e(str);
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f9930a.mo25441c(str, str2, z);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f9930a.mo25438f(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        s.j(conditionalUserProperty);
        AbstractC4145e abstractC4145e = this.f9930a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C4430y5.m27808b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        abstractC4145e.mo25440d(bundle);
    }

    public AppMeasurement(InterfaceC4256j7 interfaceC4256j7) {
        this.f9930a = new C4143c(interfaceC4256j7);
    }
}
