package ai.kudi.agent.core.fcm;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.util.Pref;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.issues.p008ui.IssueActivity;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.notification.data.model.NotificationModel;
import ai.kudi.agent.notification.data.model.NotificationModelKt;
import ai.kudi.agent.notification.p013ui.NotificationDetailsActivity;
import ai.kudi.agent.notification.viewmodels.NotificationType;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtAcceptDeclineActivity;
import ai.kudi.agent.outlet_mgt.activities.outlet_info.ChildOutletInformationActivity;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.settings.account.p025ui.fragment.PosActivationNotificationReceiverFragment;
import ai.kudi.agent.settings.data.Constants;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.transactions.domain.dto.IncomingMessage;
import ai.kudi.agent.transactions.domain.dto.Meta;
import ai.kudi.agent.transactions.p032ui.TransactionDetailsActivity;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.agent.users.domain.usecases.RegisterFcm;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.core.app.C1314k;
import androidx.core.content.C1335a;
import com.google.firebase.messaging.C6519m0;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hwangjr.rxbus.Bus;
import com.hwangjr.rxbus.RxBus;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13727r0;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p450e0.Object;
import p590o.p591a.Timber;
/* compiled from: FCMListenerService.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 22\u00020\u0001:\u00012B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u001c\u001a\u00020\u001d2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010 0\u001fH\u0002J\u001e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001d2\f\b\u0002\u0010$\u001a\u0006\u0012\u0002\b\u00030%H\u0002J \u0010&\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\"H\u0016J\b\u0010,\u001a\u00020\"H\u0016J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020 H\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00063"}, m10421d2 = {"Lai/kudi/agent/core/fcm/FCMListenerService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "fetchUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "getFetchUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "setFetchUser", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "pref", "Lai/kudi/agent/core/util/Pref;", "getPref", "()Lai/kudi/agent/core/util/Pref;", "setPref", "(Lai/kudi/agent/core/util/Pref;)V", "registerFcm", "Lai/kudi/agent/users/domain/usecases/RegisterFcm;", "getRegisterFcm", "()Lai/kudi/agent/users/domain/usecases/RegisterFcm;", "setRegisterFcm", "(Lai/kudi/agent/users/domain/usecases/RegisterFcm;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "dataToIncomingMessage", "Lai/kudi/agent/transactions/domain/dto/IncomingMessage;", TransactionBreakDownItemType.DATA, "", "", "displayNotification", "", "incomingMessage", "clazz", "Ljava/lang/Class;", "notificationBuilder", "context", "Landroid/content/Context;", "launchPendingIntent", "Landroid/app/PendingIntent;", "onCreate", "onDestroy", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FCMListenerService extends FirebaseMessagingService {
    public static final Companion Companion;
    public static final String NOTIFICATION_CHANNEL_ID = "kudi_channel_id";
    private static final String TAG;
    public FetchCurrentUser fetchUser;
    public Pref pref;
    public RegisterFcm registerFcm;
    public SharedPreferences sharedPreferences;

    /* compiled from: FCMListenerService.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/core/fcm/FCMListenerService$Companion;", "", "()V", "NOTIFICATION_CHANNEL_ID", "", "TAG", "kotlin.jvm.PlatformType", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r1 = new Companion(null);
        Companion = $r1;
        String $r0 = FCMListenerService.class.getCanonicalName();
        TAG = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0049 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final ai.kudi.agent.transactions.domain.dto.IncomingMessage dataToIncomingMessage(java.util.Map r25) {
        /*
            r24 = this;
            ai.kudi.agent.core.fcm.FCMListenerService$dataToIncomingMessage$type$1 r2 = new ai.kudi.agent.core.fcm.FCMListenerService$dataToIncomingMessage$type$1
            r2.<init>()
            java.lang.reflect.Type r3 = r2.getType()
            java.lang.String r5 = "options"
            r0 = r25
            java.lang.Object r4 = r0.get(r5)
            if (r4 == 0) goto L32
            com.google.gson.f r6 = new com.google.gson.f
            r6.<init>()
            java.lang.String r5 = "options"
            r0 = r25
            java.lang.Object r4 = r0.get(r5)
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            r7 = r8
            java.lang.Object r4 = r6.m20759m(r7, r3)
            java.lang.String r5 = "Gson().fromJson(data[\"options\"], type)"
            kotlin.p483e0.p485d.Log_OC.loadImage(r4, r5)
            r10 = r4
            java.util.List r10 = (java.util.List) r10
            r9 = r10
            goto L36
        L32:
            java.util.List r9 = kotlin.p557z.C13722p.m3941e()
        L36:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            r0 = r25
            java.util.Set r12 = r0.entrySet()
            java.util.Iterator r13 = r12.iterator()
        L45:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L7a
            java.lang.Object r4 = r13.next()
            r16 = r4
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16
            r15 = r16
            java.lang.Object r4 = r15.getKey()
            r17 = r4
            java.lang.String r17 = (java.lang.String) r17
            r7 = r17
            java.lang.String r5 = "options"
            boolean r14 = kotlin.p483e0.p485d.Log_OC.append(r7, r5)
            r18 = 1
            r0 = r18
            r14 = r14 ^ r0
            if (r14 == 0) goto L45
            java.lang.Object r4 = r15.getKey()
            java.lang.Object r19 = r15.getValue()
            r0 = r19
            r11.put(r4, r0)
            goto L45
        L7a:
            com.google.gson.f r6 = new com.google.gson.f
            r6.<init>()
            com.google.gson.l r20 = r6.m20773A(r11)
            com.google.gson.f r6 = new com.google.gson.f
            r6.<init>()
            java.lang.Class<ai.kudi.agent.transactions.domain.dto.IncomingMessage> r21 = ai.kudi.agent.transactions.domain.dto.IncomingMessage.class
            r0 = r20
            r1 = r21
            java.lang.Object r4 = r6.m20765g(r0, r1)
            r23 = r4
            ai.kudi.agent.transactions.domain.dto.IncomingMessage r23 = (ai.kudi.agent.transactions.domain.dto.IncomingMessage) r23
            r22 = r23
            r0 = r22
            r0.options = r9
            java.lang.String r5 = "incomingMessage"
            r0 = r22
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r5)
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.core.fcm.FCMListenerService.dataToIncomingMessage(java.util.Map):ai.kudi.agent.transactions.domain.dto.IncomingMessage");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void displayNotification(IncomingMessage incomingMessage, Class cls) {
        HashMap $r11;
        HashMap $r112;
        HashMap $r113;
        HashMap $r114;
        HashMap $r115;
        HashMap $r116;
        FCMListenerService r20 = this;
        Context $r3 = r20.getApplicationContext();
        Intent r18 = new Intent($r3, cls);
        String $r5 = incomingMessage.getType();
        Locale $r6 = Locale.getDefault();
        Log_OC.loadImage($r6, "getDefault()");
        String $r7 = IncomingMessage.TYPE_NOTIFICATION.toUpperCase($r6);
        Log_OC.loadImage($r7, "(this as java.lang.String).toUpperCase(locale)");
        boolean $z0 = Log_OC.append($r5, $r7);
        if ($z0) {
            String $r52 = incomingMessage.getTitle();
            Log_OC.loadImage($r52, "incomingMessage.title");
            String $r72 = incomingMessage.getMessage();
            Log_OC.loadImage($r72, "incomingMessage.message");
            C13287o $r10 = C13664u.m4227a("createdAt", "");
            C13287o $r102 = C13664u.m4227a("isDateView", "false");
            C13287o[] $r9 = {$r10, $r102};
            $r116 = C13727r0.m3879m($r9);
            NotificationModel r19 = new NotificationModel("to be added later", $r52, $r72, "NOTIFICATION", "NOTIFICATION", "", false, false, $r116);
            r18.putExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY, r19);
        } else {
            boolean $z02 = Log_OC.append($r5, "PENDING_FRAUD_CHECK");
            if ($z02) {
                String $r53 = incomingMessage.getTitle();
                Log_OC.loadImage($r53, "incomingMessage.title");
                String $r73 = incomingMessage.getMessage();
                Log_OC.loadImage($r73, "incomingMessage.message");
                NotificationType $r12 = NotificationType.PENDING_FRAUD_CHECK;
                String $r13 = $r12.name();
                String $r14 = incomingMessage.getRef();
                Log_OC.loadImage($r14, "incomingMessage.ref");
                C13287o $r103 = C13664u.m4227a("createdAt", "");
                C13287o $r104 = C13664u.m4227a("isDateView", "false");
                C13287o[] $r92 = {$r103, $r104};
                $r115 = C13727r0.m3879m($r92);
                NotificationModel r192 = new NotificationModel("to be added later", $r53, $r73, $r13, $r14, "", false, false, $r115);
                r18.putExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY, r192);
            } else {
                boolean $z03 = Log_OC.append($r5, IncomingMessage.TYPE_TICKET_STATUS);
                if ($z03) {
                    String $r54 = incomingMessage.getRef();
                    Log_OC.loadImage($r54, "incomingMessage.ref");
                    String $r74 = incomingMessage.getTitle();
                    Log_OC.loadImage($r74, "incomingMessage.title");
                    String $r132 = incomingMessage.getMessage();
                    Log_OC.loadImage($r132, "incomingMessage.message");
                    NotificationType $r122 = NotificationType.TICKET_NOTIFICATION;
                    String $r142 = $r122.name();
                    String $r15 = incomingMessage.getRef();
                    Log_OC.loadImage($r15, "incomingMessage.ref");
                    C13287o $r105 = C13664u.m4227a("createdAt", "");
                    C13287o $r106 = C13664u.m4227a("isDateView", "false");
                    C13287o[] $r93 = {$r105, $r106};
                    $r114 = C13727r0.m3879m($r93);
                    NotificationModel r193 = new NotificationModel($r54, $r74, $r132, $r142, $r15, "", false, false, $r114);
                    r18.putExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY, r193);
                } else {
                    boolean $z04 = Log_OC.append($r5, IncomingMessage.TYPE_OUTLET_LINKING_REQUEST);
                    if ($z04) {
                        String $r55 = incomingMessage.getTitle();
                        String $r75 = incomingMessage.getMessage();
                        String $r133 = incomingMessage.getRef();
                        NotificationType $r123 = NotificationType.OUTLET_LINKING;
                        String $r143 = $r123.name();
                        C13287o $r107 = C13664u.m4227a("createdAt", "");
                        C13287o $r108 = C13664u.m4227a("isDateView", "false");
                        C13287o[] $r94 = {$r107, $r108};
                        $r113 = C13727r0.m3879m($r94);
                        Log_OC.loadImage($r55, KudiPin.KUDI_PIN_TITLE);
                        Log_OC.loadImage($r75, MetricTracker.Object.MESSAGE);
                        Log_OC.loadImage($r133, "ref");
                        NotificationModel r194 = new NotificationModel("to be added later", $r55, $r75, $r143, $r133, null, false, false, $r113, 224, null);
                        r18.putExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY, r194);
                    } else {
                        boolean $z05 = Log_OC.append($r5, IncomingMessage.TYPE_OUTLET_LINK_ACCEPTED);
                        if ($z05) {
                            String $r56 = incomingMessage.getTitle();
                            String $r76 = incomingMessage.getMessage();
                            String $r134 = incomingMessage.getRef();
                            NotificationType $r124 = NotificationType.OUTLET_LINK_ACCEPTED;
                            String $r144 = $r124.name();
                            C13287o $r109 = C13664u.m4227a("createdAt", "");
                            C13287o $r1010 = C13664u.m4227a("isDateView", "false");
                            C13287o[] $r95 = {$r109, $r1010};
                            $r112 = C13727r0.m3879m($r95);
                            Log_OC.loadImage($r56, KudiPin.KUDI_PIN_TITLE);
                            Log_OC.loadImage($r76, MetricTracker.Object.MESSAGE);
                            Log_OC.loadImage($r134, "ref");
                            NotificationModel r195 = new NotificationModel("to be added later", $r56, $r76, $r144, $r134, null, false, false, $r112, 224, null);
                            r18.putExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY, r195);
                        } else {
                            boolean $z06 = Log_OC.append($r5, IncomingMessage.TYPE_KYC_UPGRADE_FAILED);
                            if ($z06) {
                                r18.putExtra("PARAM_SETTINGS", Constants.SETTINGS_PARAM_UPGRADE_KYC);
                            } else {
                                boolean $z07 = Log_OC.append($r5, IncomingMessage.TYPE_TERMINAL_DELIVERED);
                                if ($z07) {
                                    r18.putExtra("PARAM_SETTINGS", Constants.SETTINGS_PARAM_ACTIVATE_POS);
                                    Meta $r16 = incomingMessage.getMeta();
                                    r18.putExtra(PosActivationNotificationReceiverFragment.EXTRA_URL, $r16.getUrl());
                                } else {
                                    boolean $z08 = Log_OC.append($r5, IncomingMessage.TYPE_KYC_UPGRADE_SUCCESSFUL);
                                    if ($z08) {
                                        String $r57 = incomingMessage.getTitle();
                                        String $r77 = incomingMessage.getMessage();
                                        String $r135 = incomingMessage.getRef();
                                        NotificationType $r125 = NotificationType.KYC_UPGRADE_FAILED;
                                        String $r145 = $r125.name();
                                        C13287o $r1011 = C13664u.m4227a("createdAt", "");
                                        C13287o $r1012 = C13664u.m4227a("isDateView", "false");
                                        C13287o[] $r96 = {$r1011, $r1012};
                                        $r11 = C13727r0.m3879m($r96);
                                        Log_OC.loadImage($r57, KudiPin.KUDI_PIN_TITLE);
                                        Log_OC.loadImage($r77, MetricTracker.Object.MESSAGE);
                                        Log_OC.loadImage($r135, "ref");
                                        NotificationModel r196 = new NotificationModel("to be added later", $r57, $r77, $r145, $r135, null, false, false, $r11, 224, null);
                                        r18.putExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY, r196);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        PendingIntent $r17 = PendingIntent.getActivity($r3, 1, r18, 134217728);
        Log_OC.loadImage($r3, "context");
        Log_OC.loadImage($r17, "launchPendingIntent");
        notificationBuilder(incomingMessage, $r3, $r17);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void displayNotification$default(FCMListenerService fCMListenerService, IncomingMessage incomingMessage, Class $r3, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r3 = HomeActivity.class;
        }
        fCMListenerService.displayNotification(incomingMessage, $r3);
    }

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void notificationBuilder(IncomingMessage incomingMessage, Context context, PendingIntent pendingIntent) {
        FCMListenerService r17 = this;
        String $r4 = r17.getString(C0001R.string.app_name);
        Log_OC.loadImage($r4, "getString(R.string.app_name)");
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 26) {
            NotificationChannel r13 = new NotificationChannel(NOTIFICATION_CHANNEL_ID, $r4, 3);
            r13.setDescription($r4);
            r13.setLightColor(-16711681);
            r13.canShowBadge();
            r13.setShowBadge(true);
            FCMListenerService r172 = this;
            Object $r6 = r172.getSystemService(IncomingMessage.TYPE_NOTIFICATION);
            if ($r6 == null) {
                NullPointerException r14 = new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
                throw r14;
            } else {
                NotificationManager $r7 = (NotificationManager) $r6;
                $r7.createNotificationChannel(r13);
            }
        }
        C1314k.C1323e r15 = new C1314k.C1323e(context, NOTIFICATION_CHANNEL_ID);
        r15.m36392l(incomingMessage.getTitle());
        r15.m36393k(incomingMessage.getMessage());
        C1314k.C1319c r16 = new C1314k.C1319c();
        r16.m36411h(incomingMessage.getMessage());
        r15.m36380x(r16);
        Uri $r11 = RingtoneManager.getDefaultUri(2);
        r15.m36381w($r11);
        r15.m36394j(pendingIntent);
        r15.m36398f(true);
        Log_OC.loadImage(r15, "Builder(context, NOTIFICATION_CHANNEL_ID)\n            .setContentTitle(incomingMessage.title)\n            .setContentText(incomingMessage.message)\n            .setStyle(NotificationCompat.BigTextStyle().bigText(incomingMessage.message))\n            .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))\n            .setContentIntent(launchPendingIntent)\n            .setAutoCancel(true)");
        int $i02 = Build.VERSION.SDK_INT;
        if ($i02 >= 21) {
            r15.m36382v(C0001R.C0002drawable.nomba_logo);
            int $i03 = C1335a.m36324d(context, C0001R.color.colorPrimary);
            r15.m36395i($i03);
        } else {
            r15.m36382v(C0001R.mipmap.ic_launcher);
        }
        Object $r62 = context.getSystemService(IncomingMessage.TYPE_NOTIFICATION);
        if ($r62 == null) {
            NullPointerException r142 = new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            throw r142;
        }
        NotificationManager $r72 = (NotificationManager) $r62;
        Notification $r12 = r15.m36402b();
        $r72.notify(1, $r12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onNewToken$lambda-2  reason: not valid java name */
    public static final void m39135onNewToken$lambda2(FCMListenerService fCMListenerService, String str, User user) {
        Log_OC.getArray(fCMListenerService, "this$0");
        Log_OC.getArray(str, "$token");
        boolean $z0 = user.isLoggedIn();
        if ($z0) {
            RegisterFcm $r3 = fCMListenerService.getRegisterFcm();
            AbstractC11688p $r4 = $r3.execute(str);
            Chunk $r5 = Chunk.NEWLINE;
            Token $r6 = Token.GREATER_THAN;
            $r4.e0($r5, $r6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onNewToken$lambda-2$lambda-0  reason: not valid java name */
    public static final void m39136onNewToken$lambda2$lambda0(User user) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onNewToken$lambda-2$lambda-1  reason: not valid java name */
    public static final void m39137onNewToken$lambda2$lambda1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onNewToken$lambda-3  reason: not valid java name */
    public static final void m39138onNewToken$lambda3(Throwable th) {
        String $r1 = th.getMessage();
        Log.e("fcm_error", Log_OC.m10359a("Message==> ", (Object) $r1));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getFetchUser() {
        FetchCurrentUser $r1 = this.fetchUser;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("fetchUser");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Pref getPref() {
        Pref $r1 = this.pref;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("pref");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RegisterFcm getRegisterFcm() {
        RegisterFcm $r1 = this.registerFcm;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("registerFcm");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Service
    public void onCreate() {
        FCMListenerService r7 = this;
        Application $r1 = r7.getApplication();
        if ($r1 == null) {
            NullPointerException r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r6;
        }
        BaseApplication $r2 = (BaseApplication) $r1;
        ApplicationComponent $r3 = $r2.initializeComponent();
        $r3.inject(this);
        FCMListenerService r72 = this;
        super.onCreate();
        Bus $r4 = RxBus.getBus();
        $r4.register(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.firebase.messaging.AbstractServiceC6496g, android.app.Service
    public void onDestroy() {
        Bus $r1 = RxBus.getBus();
        $r1.unregister(this);
        FCMListenerService r2 = this;
        super.onDestroy();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(C6519m0 c6519m0) {
        Log_OC.getArray(c6519m0, "remoteMessage");
        Map $r2 = c6519m0.m21728f();
        Log_OC.loadImage($r2, "remoteMessage.data");
        IncomingMessage $r3 = dataToIncomingMessage($r2);
        Object[] $r5 = new Object[0];
        Timber.m1627e(Log_OC.m10359a("Message Data ", $r2), $r5);
        String $r4 = $r3.getType();
        boolean $z0 = Log_OC.append($r4, "transaction");
        if ($z0) {
            Bus $r6 = RxBus.getBus();
            $r6.post($r3);
            return;
        }
        boolean $z02 = Log_OC.append($r4, IncomingMessage.TYPE_NOTIFICATION);
        if ($z02) {
            displayNotification$default(this, $r3, null, 2, null);
            return;
        }
        boolean $z03 = Log_OC.append($r4, "PENDING_FRAUD_CHECK");
        if ($z03) {
            Pref $r7 = getPref();
            int $i0 = $r7.getIncompleteTransactionCount();
            $r7.setIncompleteTransactionCount($i0 + 1);
            displayNotification($r3, TransactionDetailsActivity.class);
            return;
        }
        boolean $z04 = Log_OC.append($r4, IncomingMessage.TYPE_OUTLET_LINKING_REQUEST);
        if ($z04) {
            displayNotification($r3, OutletMgtAcceptDeclineActivity.class);
            return;
        }
        boolean $z05 = Log_OC.append($r4, IncomingMessage.TYPE_OUTLET_LINK_ACCEPTED);
        if ($z05) {
            SharedPreferences $r8 = getSharedPreferences();
            boolean $z06 = $r8.getBoolean(LoginParams.EXTRA_IS_HQ, false);
            if ($z06) {
                displayNotification($r3, ChildOutletInformationActivity.class);
                return;
            }
            return;
        }
        boolean $z07 = Log_OC.append($r4, IncomingMessage.TYPE_KYC_UPGRADE_SUCCESSFUL);
        if ($z07) {
            displayNotification($r3, HomeActivity.class);
            return;
        }
        boolean $z08 = Log_OC.append($r4, IncomingMessage.TYPE_KYC_UPGRADE_FAILED);
        if ($z08) {
            displayNotification($r3, SettingsActivity.class);
            return;
        }
        String $r9 = IncomingMessage.TYPE_TICKET_STATUS;
        boolean $z09 = Log_OC.append($r4, $r9);
        if ($z09) {
            displayNotification($r3, IssueActivity.class);
            return;
        }
        boolean $z010 = Log_OC.append($r4, IncomingMessage.TYPE_TERMINAL_DELIVERED);
        if ($z010) {
            displayNotification($r3, SettingsActivity.class);
        } else {
            displayNotification($r3, NotificationDetailsActivity.class);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(final String str) {
        Log_OC.getArray(str, "token");
        super.onNewToken(str);
        String $r2 = TAG;
        String $r3 = Log_OC.m10359a("Refreshed token: ", (Object) str);
        Log.d($r2, $r3);
        FetchCurrentUser $r4 = getFetchUser();
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.core.fcm.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FCMListenerService $r1 = FCMListenerService.this;
                String $r22 = str;
                User $r42 = (User) obj;
                FCMListenerService.m39135onNewToken$lambda2($r1, $r22, $r42);
            }
        };
        Function $r7 = Function.LOG;
        $r5.s(object, $r7);
    }

    public final void setFetchUser(FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(fetchCurrentUser, "<set-?>");
        this.fetchUser = fetchCurrentUser;
    }

    public final void setPref(Pref pref) {
        Log_OC.getArray(pref, "<set-?>");
        this.pref = pref;
    }

    public final void setRegisterFcm(RegisterFcm registerFcm) {
        Log_OC.getArray(registerFcm, "<set-?>");
        this.registerFcm = registerFcm;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }
}
