package ai.kudi.agent.core.util;

import ai.kudi.agent.core.C0038R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.util.CustomDialog;
import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import androidx.core.app.C1291a;
import androidx.core.content.C1335a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.C4107a;
import com.google.android.gms.location.C4109b;
import com.google.android.gms.location.C4112c;
import com.google.android.gms.location.C4115d;
import com.google.android.gms.location.C4121h;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.android.gms.tasks.InterfaceC4456f;
import com.google.android.gms.tasks.InterfaceC4458g;
import com.google.android.gms.tasks.Item;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: LocationUtil.kt */
@Metadata(m10422d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J?\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\b0\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\bJ\u0016\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006J5\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\b0\u000eH\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/core/util/LocationUtil;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "accessFineLocation", "", "getLastLocation", "", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "reqCodeToUse", "", "callback", "Lkotlin/Function1;", "Landroid/location/Location;", "Lkotlin/ParameterName;", "name", "location", "isGpsOn", "", "onGpsWithoutSetting", "storePreference", "context", "Landroid/content/Context;", "preferenceName", "triggerLocationCall", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class LocationUtil {
    public static final Companion Companion;
    public static final String IS_LOCATION_ALLOWED_PREFERENCE_BILLS = "isLocationAllowedPreference";
    public static final String IS_LOCATION_ALLOWED_PREFERENCE_TRANSFER = "isLocationAllowedPreferenceForTransfer";
    public static final String LOCATION_PREFERENCE = "notificationPreference";
    public static final int REQUEST_CHECK_SETTINGS = 1;
    public static final int REQUEST_FINE_LOCATION = 1000;
    private final String accessFineLocation;
    private final Activity activity;

    /* compiled from: LocationUtil.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/core/util/LocationUtil$Companion;", "", "()V", "IS_LOCATION_ALLOWED_PREFERENCE_BILLS", "", "IS_LOCATION_ALLOWED_PREFERENCE_TRANSFER", "LOCATION_PREFERENCE", "REQUEST_CHECK_SETTINGS", "", "REQUEST_FINE_LOCATION", "handleDeniedPermission", "", "context", "Landroid/content/Context;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void handleDeniedPermission(Context context) {
            Log_OC.getArray(context, "context");
            int $i0 = C0038R.string.permission_message;
            String $r4 = context.getString($i0);
            Log_OC.loadImage($r4, "context.getString(R.string.permission_message)");
            LocationUtil$Companion$handleDeniedPermission$positiveCallback$1 $r3 = new LocationUtil$Companion$handleDeniedPermission$positiveCallback$1(context);
            CustomDialog.Companion $r2 = CustomDialog.Companion;
            CustomDialog.Companion.show$default($r2, "Permission required", $r4, (String) null, (String) null, $r3, (InterfaceC11756a) null, context, 44, (Object) null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public LocationUtil(Activity activity) {
        Log_OC.getArray(activity, "activity");
        this.activity = activity;
        this.accessFineLocation = "android.permission.ACCESS_FINE_LOCATION";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void getLastLocation$default(LocationUtil locationUtil, C4107a $r3, int $i0, InterfaceC11767l interfaceC11767l, int i, Object obj) {
        if (obj != null) {
            UnsupportedOperationException $r6 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLastLocation");
            throw $r6;
        }
        int $i2 = i & 1;
        if ($i2 != 0) {
            Activity $r5 = locationUtil.activity;
            C4107a $r1 = C4109b.m28503a($r5);
            $r3 = $r1;
            Log_OC.loadImage($r1, "fun getLastLocation(\n        fusedLocationProviderClient: FusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(activity),\n        reqCodeToUse: Int = REQUEST_FINE_LOCATION,\n        callback: (location: Location?) -> Unit\n    ) {\n        when {\n            ContextCompat.checkSelfPermission(\n                activity.applicationContext,\n                accessFineLocation\n            ) == PackageManager.PERMISSION_GRANTED -> {\n                triggerLocationCall(fusedLocationProviderClient, callback)\n            }\n            shouldShowRequestPermissionRationale(\n                activity,\n                accessFineLocation\n            ) -> {\n                handleDeniedPermission(activity)\n            }\n            else -> {\n                requestPermission(activity, reqCodeToUse, accessFineLocation)\n            }\n        }\n    }");
        }
        int $i1 = i & 2;
        if ($i1 != 0) {
            $i0 = 1000;
        }
        locationUtil.getLastLocation($r3, $i0, interfaceC11767l);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onGpsWithoutSetting$lambda-0 */
    public static final void m39180onGpsWithoutSetting$lambda0(Item item, LocationUtil locationUtil, Item item2) {
        Log_OC.getArray(item, "$result");
        Log_OC.getArray(locationUtil, "this$0");
        try {
            Object $r5 = item.getTag(ApiException.class);
            C4115d c4115d = (C4115d) $r5;
        } catch (ApiException $r7) {
            ApiException r10 = $r7;
            CrashlyticsReport.logException(r10);
            int $i0 = $r7.m32105b();
            if ($i0 != 6) {
                return;
            }
            ResolvableApiException $r8 = (ResolvableApiException) $r7;
            Activity $r9 = locationUtil.activity;
            try {
                $r8.m32100c($r9, 1);
            } catch (IntentSender.SendIntentException e) {
            } catch (ClassCastException e2) {
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void triggerLocationCall(C4107a c4107a, final InterfaceC11767l interfaceC11767l) {
        boolean $z0 = isGpsOn();
        if (!$z0) {
            onGpsWithoutSetting();
            return;
        }
        com.google.android.gms.tasks.j<Location> p = c4107a.m28505p();
        p.m27797a(new InterfaceC4458g() { // from class: ai.kudi.agent.core.util.k
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void onCreate(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                Location $r3 = (Location) obj;
                LocationUtil.m39181triggerLocationCall$lambda1($r1, $r3);
            }
        });
        p.m27798a(new InterfaceC4456f() { // from class: ai.kudi.agent.core.util.Utilities$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void onPostExecute(Exception exc) {
                InterfaceC11767l $r2 = InterfaceC11767l.this;
                LocationUtil.m39182triggerLocationCall$lambda2($r2, exc);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: triggerLocationCall$lambda-1 */
    public static final void m39181triggerLocationCall$lambda1(InterfaceC11767l interfaceC11767l, Location location) {
        Log_OC.getArray(interfaceC11767l, "$callback");
        Location $r2 = new Location("");
        double $d1 = location == null ? 0.0d : location.getLatitude();
        $r2.setLatitude($d1);
        double $d0 = location != null ? location.getLongitude() : 0.0d;
        $r2.setLongitude($d0);
        interfaceC11767l.invoke($r2);
    }

    /* renamed from: triggerLocationCall$lambda-2 */
    public static final void m39182triggerLocationCall$lambda2(InterfaceC11767l interfaceC11767l, Exception exc) {
        Log_OC.getArray(interfaceC11767l, "$callback");
        exc.printStackTrace();
        interfaceC11767l.invoke(null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getLastLocation(C4107a c4107a, int i, InterfaceC11767l interfaceC11767l) {
        Log_OC.getArray(c4107a, "fusedLocationProviderClient");
        Log_OC.getArray(interfaceC11767l, "callback");
        Activity $r3 = this.activity;
        Context $r4 = $r3.getApplicationContext();
        String $r5 = this.accessFineLocation;
        int $i1 = C1335a.m36327a($r4, $r5);
        if ($i1 == 0) {
            triggerLocationCall(c4107a, interfaceC11767l);
            return;
        }
        Activity $r32 = this.activity;
        String $r52 = this.accessFineLocation;
        boolean $z0 = C1291a.m36463t($r32, $r52);
        if ($z0) {
            Companion $r6 = Companion;
            Activity $r33 = this.activity;
            $r6.handleDeniedPermission($r33);
            return;
        }
        Activity $r34 = this.activity;
        String $r53 = this.accessFineLocation;
        String[] $r7 = {$r53};
        AndroidOsPermissionUtilKt.requestPermission($r34, i, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isGpsOn() {
        Activity $r1 = this.activity;
        Object $r2 = $r1.getSystemService("location");
        if ($r2 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
            throw $r5;
        }
        LocationManager $r3 = (LocationManager) $r2;
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 28) {
            boolean $z0 = $r3.isLocationEnabled();
            return $z0;
        }
        try {
            boolean $z1 = $r3.isProviderEnabled("gps");
            boolean $z2 = $r3.isProviderEnabled("network");
            return $z1 || $z2;
        } catch (Throwable $r4) {
            CrashlyticsReport.logException($r4);
            $r4.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onGpsWithoutSetting() {
        LocationRequest $r1 = LocationRequest.m28512f();
        $r1.m28508s(100);
        $r1.m28509l(30000L);
        $r1.m28510k(15000L);
        C4112c.C4113a $r2 = new C4112c.C4113a();
        $r2.m28500a($r1);
        Activity $r3 = this.activity;
        C4121h $r4 = C4109b.m28501c($r3);
        C4112c $r5 = $r2.m28499b();
        final com.google.android.gms.tasks.j<C4115d> p = $r4.m28490p($r5);
        Log_OC.loadImage(p, "getSettingsClient(activity).checkLocationSettings(builder.build())");
        p.m27799a(new InterfaceC4454e() { // from class: ai.kudi.agent.core.util.j
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: a */
            public final void m38925a(Item item) {
                Item $r22 = Item.this;
                LocationUtil $r32 = this;
                LocationUtil.m39180onGpsWithoutSetting$lambda0($r22, $r32, item);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void storePreference(Context context, String str) {
        Log_OC.getArray(context, "context");
        Log_OC.getArray(str, "preferenceName");
        SharedPreferences $r3 = context.getSharedPreferences(LOCATION_PREFERENCE, 0);
        Log_OC.loadImage($r3, "context.getSharedPreferences(LOCATION_PREFERENCE, 0)");
        SharedPreferences.Editor $r4 = $r3.edit();
        $r4.putBoolean(str, true);
        $r4.apply();
    }
}
