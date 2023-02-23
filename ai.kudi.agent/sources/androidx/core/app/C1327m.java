package androidx.core.app;

import ai.kudi.agent.pin.KudiPin;
import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.C1314k;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationCompatJellybean.java */
/* renamed from: androidx.core.app.m */
/* loaded from: classes2.dex */
public class C1327m {

    /* renamed from: a */
    private static final Object f4170a = new Object();

    /* renamed from: b */
    private static Field f4171b;

    /* renamed from: c */
    private static boolean f4172c;

    /* renamed from: a */
    public static SparseArray<Bundle> m36360a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Bundle m36359b(C1314k.C1315a c1315a) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat m36422e = c1315a.m36422e();
        bundle2.putInt("icon", m36422e != null ? m36422e.m36215e() : 0);
        bundle2.putCharSequence(KudiPin.KUDI_PIN_TITLE, c1315a.m36418i());
        bundle2.putParcelable("actionIntent", c1315a.m36426a());
        if (c1315a.m36423d() != null) {
            bundle = new Bundle(c1315a.m36423d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c1315a.m36425b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m36356e(c1315a.m36421f()));
        bundle2.putBoolean("showsUserInterface", c1315a.m36419h());
        bundle2.putInt("semanticAction", c1315a.m36420g());
        return bundle2;
    }

    /* renamed from: c */
    public static Bundle m36358c(Notification notification) {
        synchronized (f4170a) {
            if (f4172c) {
                return null;
            }
            try {
                if (f4171b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f4172c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f4171b = declaredField;
                }
                Bundle bundle = (Bundle) f4171b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f4171b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f4172c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f4172c = true;
                return null;
            }
        }
    }

    /* renamed from: d */
    private static Bundle m36357d(C1329o c1329o) {
        new Bundle();
        c1329o.m36344c();
        throw null;
    }

    /* renamed from: e */
    private static Bundle[] m36356e(C1329o[] c1329oArr) {
        if (c1329oArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c1329oArr.length];
        if (c1329oArr.length <= 0) {
            return bundleArr;
        }
        m36357d(c1329oArr[0]);
        throw null;
    }

    /* renamed from: f */
    public static Bundle m36355f(Notification.Builder builder, C1314k.C1315a c1315a) {
        IconCompat m36422e = c1315a.m36422e();
        builder.addAction(m36422e != null ? m36422e.m36215e() : 0, c1315a.m36418i(), c1315a.m36426a());
        Bundle bundle = new Bundle(c1315a.m36423d());
        if (c1315a.m36421f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m36356e(c1315a.m36421f()));
        }
        if (c1315a.m36424c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m36356e(c1315a.m36424c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c1315a.m36425b());
        return bundle;
    }
}
