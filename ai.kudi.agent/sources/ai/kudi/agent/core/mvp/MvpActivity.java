package ai.kudi.agent.core.mvp;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.network.mods.NetworkModule;
import ai.kudi.agent.network.mods.ServiceModule;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.users.data.network.UserService;
import ai.kudi.agent.users.data.repositories.RoomUserRepository;
import ai.kudi.agent.users.domain.package_1.User;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import h.d.a.c.e;
import io.intercom.android.sdk.Intercom;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9409a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p470j0.ClassWriter;
import p565l.InterfaceC14233u;
import p565l.p574h0.C14207a;
import p590o.p591a.Timber;
import retrofit2.C14841m;
/* compiled from: MvpActivity.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\b'\u0018\u0000 !*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0007:\u0001!B\u0005¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0004J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0014J\b\u0010\u001c\u001a\u00020\u0014H\u0017J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0012\u0010\t\u001a\u00028\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u00028\u0002X\u0086.¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m10421d2 = {"Lai/kudi/agent/core/mvp/MvpActivity;", "V", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "P", "Lcom/hannesdorfmann/mosby3/mvp/MvpPresenter;", "VB", "Landroidx/viewbinding/ViewBinding;", "Lcom/hannesdorfmann/mosby3/mvp/MvpActivity;", "()V", "activityBinding", "getActivityBinding", "()Landroidx/viewbinding/ViewBinding;", "binding", "getBinding", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "logoutDisabled", "", "disableLogoutTimer", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onUserInteraction", "setTitle", KudiPin.KUDI_PIN_TITLE, "", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class MvpActivity<V extends e, P extends InterfaceC9413d<V>, VB extends InterfaceC8209a> extends AbstractC9409a<V, P> {
    public static final Companion Companion;
    public static final long DISCONNECT_TIMEOUT = 300000;
    public static final String PAGE_KEY = "MvpActivity";
    private static Timer disconnectTimer;
    private static boolean isInvisible;
    public VB binding;
    private boolean logoutDisabled;

    /* compiled from: MvpActivity.kt */
    @Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u001b\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/core/mvp/MvpActivity$Companion;", "", "()V", "DISCONNECT_TIMEOUT", "", "TAG", "", "disconnectTimer", "Ljava/util/Timer;", "getDisconnectTimer", "()Ljava/util/Timer;", "setDisconnectTimer", "(Ljava/util/Timer;)V", "isInvisible", "", "disconnectTask", "Ljava/util/TimerTask;", "context", "Landroid/app/Activity;", "getUserRepo", "Lai/kudi/agent/users/data/repositories/RoomUserRepository;", "Landroid/content/Context;", "logout", "", "navigateToNotification", "resetDisconnectTimer", "showLogin", "stopDisconnectTimer", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        private final TimerTask disconnectTask(Activity activity) {
            MvpActivity$Companion$disconnectTask$1 $r2 = new MvpActivity$Companion$disconnectTask$1(activity);
            return $r2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final RoomUserRepository getUserRepo(Context context) {
            NetworkModule $r2 = new NetworkModule();
            ServiceModule $r3 = new ServiceModule();
            InterfaceC14233u $r4 = $r2.providesAuthInterceptor();
            InterfaceC14233u $r5 = $r2.providesVersionInterceptor();
            C14207a $r6 = $r2.providesLoginInterceptor();
            C14841m $r7 = $r3.providesRetrofit(context, $r4, $r5, $r6);
            Object $r8 = $r7.m274d(UserService.class);
            UserService $r9 = (UserService) $r8;
            CoreAppDatabase.Companion $r11 = CoreAppDatabase.Companion;
            CoreAppDatabase $r12 = $r11.getInstance(context);
            Log_OC.append($r12);
            Log_OC.loadImage($r9, "service");
            RoomUserRepository $r10 = new RoomUserRepository($r12, $r9);
            return $r10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void resetDisconnectTimer(Activity activity) {
            Timer $r2 = getDisconnectTimer();
            $r2.cancel();
            Timer $r22 = getDisconnectTimer();
            $r22.purge();
            Timer $r23 = new Timer();
            setDisconnectTimer($r23);
            Timer $r24 = getDisconnectTimer();
            TimerTask $r3 = disconnectTask(activity);
            $r24.schedule($r3, 300000L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void showLogin(Activity activity) {
            Object[] $r3 = new Object[0];
            Timber.wtf("show login called", $r3);
            try {
                Class $r1 = Class.forName("ai.kudi.agent.login.ui.LoginActivity");
                Intent $r4 = new Intent(activity, $r1);
                $r4.setFlags(268468224);
                activity.startActivity($r4);
            } catch (ClassNotFoundException $r5) {
                CrashlyticsReport.logException($r5);
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Timer getDisconnectTimer() {
            Timer $r1 = MvpActivity.disconnectTimer;
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void logout(Activity activity) {
            Log_OC.getArray(activity, "context");
            RoomUserRepository $r2 = getUserRepo(activity);
            User.Builder $r3 = new User.Builder();
            User $r4 = $r3.setPin("").setSessionId("").setFcmToken("").build();
            Log_OC.loadImage($r4, "Builder().setPin(\"\").setSessionId(\"\").setFcmToken(\"\").build()");
            $r2.updateUser($r4);
            Intercom $r5 = Intercom.client();
            $r5.logout();
            FirebaseAuth $r6 = FirebaseAuth.getInstance();
            $r6.m25408i();
            boolean $z0 = MvpActivity.isInvisible;
            if ($z0) {
                return;
            }
            ContextExtKt.toast$default(activity, "You have been logged out", 0, 2, (Object) null);
            showLogin(activity);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void navigateToNotification(Activity activity) {
            Log_OC.getArray(activity, "context");
            try {
                Class $r3 = Class.forName("ai.kudi.agent.notification.ui.NotificationActivity");
                Intent $r2 = new Intent(activity, $r3);
                activity.startActivity($r2);
            } catch (ClassNotFoundException $r4) {
                String $r5 = Log_OC.m10359a("class not found for notifications ", $r4);
                Object[] $r6 = new Object[0];
                Timber.wtf($r5, $r6);
                CrashlyticsReport.logException($r4);
            }
        }

        public final void setDisconnectTimer(Timer timer) {
            Log_OC.getArray(timer, "<set-?>");
            MvpActivity.disconnectTimer = timer;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void stopDisconnectTimer() {
            Timer $r1 = getDisconnectTimer();
            $r1.cancel();
            Timer $r12 = new Timer();
            setDisconnectTimer($r12);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        Timer $r1 = new Timer();
        disconnectTimer = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onResume$lambda-0  reason: not valid java name */
    public static final void m39152onResume$lambda0(MvpActivity mvpActivity, User user) {
        Log_OC.getArray(mvpActivity, "this$0");
        Companion $r2 = Companion;
        Activity r3 = (Activity) mvpActivity;
        $r2.resetDisconnectTimer(r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onResume$lambda-1  reason: not valid java name */
    public static final void m39153onResume$lambda1(MvpActivity mvpActivity, Throwable th) {
        Log_OC.getArray(mvpActivity, "this$0");
        String $r1 = Log_OC.m10359a("error fetching user ", th);
        Object[] $r3 = new Object[0];
        Timber.wtf($r1, $r3);
        th.printStackTrace();
        Companion $r4 = Companion;
        Activity r5 = (Activity) mvpActivity;
        $r4.showLogin(r5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setTitle$lambda-2  reason: not valid java name */
    public static final void m39154setTitle$lambda2(MvpActivity mvpActivity, CharSequence charSequence) {
        Log_OC.getArray(mvpActivity, "this$0");
        Log_OC.getArray(charSequence, "$title");
        Activity r2 = (Activity) mvpActivity;
        super/*android.app.Activity*/.setTitle(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void disableLogoutTimer() {
        this.logoutDisabled = true;
        Companion $r1 = Companion;
        $r1.stopDisconnectTimer();
    }

    public abstract InterfaceC8209a getActivityBinding();

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC8209a getBinding() {
        InterfaceC8209a $r1 = this.binding;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("binding");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC8209a $r2 = getActivityBinding();
        setBinding($r2);
        InterfaceC8209a $r22 = getBinding();
        View $r3 = $r22.getRoot();
        AppCompatActivity r4 = (AppCompatActivity) this;
        r4.setContentView($r3);
        Activity r5 = (Activity) this;
        r5.setRequestedOrientation(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 == 16908332) {
            ComponentActivity r2 = (ComponentActivity) this;
            r2.onBackPressed();
        }
        Activity r3 = (Activity) this;
        boolean $z0 = super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
        return $z0;
    }

    @Override // p272h.p364d.p365a.p366c.AbstractC9409a
    protected void onPause() {
        super.onPause();
        isInvisible = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a
    public void onResume() {
        super.onResume();
        Companion $r2 = Companion;
        isInvisible = false;
        boolean $z0 = this.logoutDisabled;
        if ($z0) {
            return;
        }
        Context r9 = (Context) this;
        RoomUserRepository $r3 = $r2.getUserRepo(r9);
        AbstractC11696w $r4 = $r3.getCurrentUser();
        Item $r5 = ClassWriter.LogError();
        AbstractC11696w $r42 = $r4.u($r5);
        Item $r52 = ContextUtils.LogError();
        $r42.n($r52).s(new Object() { // from class: ai.kudi.agent.core.mvp.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MvpActivity $r1 = MvpActivity.this;
                User $r32 = (User) obj;
                MvpActivity.m39152onResume$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.core.mvp.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MvpActivity $r1 = MvpActivity.this;
                Throwable $r32 = (Throwable) obj;
                MvpActivity.m39153onResume$lambda1($r1, $r32);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onUserInteraction() {
        Activity r2 = (Activity) this;
        super/*android.app.Activity*/.onUserInteraction();
        boolean $z0 = this.logoutDisabled;
        if ($z0) {
            return;
        }
        Companion $r1 = Companion;
        Activity r22 = (Activity) this;
        $r1.resetDisconnectTimer(r22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBinding(InterfaceC8209a interfaceC8209a) {
        Log_OC.getArray(interfaceC8209a, "<set-?>");
        this.binding = interfaceC8209a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void setTitle(final CharSequence charSequence) {
        Log_OC.getArray(charSequence, KudiPin.KUDI_PIN_TITLE);
        Looper $r2 = Looper.getMainLooper();
        Handler $r3 = new Handler($r2);
        $r3.post(new Runnable() { // from class: ai.kudi.agent.core.mvp.AsyncServer$6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                MvpActivity $r1 = MvpActivity.this;
                CharSequence $r22 = charSequence;
                MvpActivity.m39154setTitle$lambda2($r1, $r22);
            }
        });
    }
}
