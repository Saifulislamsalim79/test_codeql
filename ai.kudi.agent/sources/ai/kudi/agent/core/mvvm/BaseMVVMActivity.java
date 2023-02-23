package ai.kudi.agent.core.mvvm;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.mvvm.AndroidLifecycle;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
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
import androidx.appcompat.app.e;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.C1556g0;
import androidx.lifecycle.C1564h0;
import androidx.lifecycle.Extension;
import com.google.firebase.auth.FirebaseAuth;
import com.trello.rxlifecycle2.FileStorage;
import com.trello.rxlifecycle2.p194g.C7392a;
import io.intercom.android.sdk.Intercom;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p470j0.ClassWriter;
import p425j.p444e.p471k0.C11678a;
import p565l.InterfaceC14233u;
import p565l.p574h0.C14207a;
import retrofit2.C14841m;
/* compiled from: BaseMVVMActivity.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\b'\u0018\u0000 0*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007:\u00010B\u0005¢\u0006\u0002\u0010\bJ\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u0001H$¢\u0006\u0002\u0010\u001dJ\r\u0010\u001e\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u001bH\u0004J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"H$J\r\u0010#\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u001fJ\u0012\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u001bH\u0014J\b\u0010+\u001a\u00020\u001bH\u0017J\b\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020/H\u0016R\u0012\u0010\t\u001a\u00028\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u00028\u0002X\u0086.¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u0019¨\u00061"}, m10421d2 = {"Lai/kudi/agent/core/mvvm/BaseMVVMActivity;", "VM", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "State", "Lai/kudi/agent/core/mvvm/ViewData;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "activityBinding", "getActivityBinding", "()Landroidx/viewbinding/ViewBinding;", "binding", "getBinding", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "lifecycleProvider", "Lcom/trello/rxlifecycle2/LifecycleProvider;", "Landroidx/lifecycle/Lifecycle$Event;", "getLifecycleProvider", "()Lcom/trello/rxlifecycle2/LifecycleProvider;", "logoutDisabled", "", "theViewModel", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "applyViewData", "", "viewData", "(Lai/kudi/agent/core/mvvm/ViewData;)V", "createViewModel", "()Lai/kudi/agent/core/mvvm/BaseViewModel;", "disableLogoutTimer", "getVMType", "Ljava/lang/Class;", "getViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onUserInteraction", "setTitle", KudiPin.KUDI_PIN_TITLE, "", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class BaseMVVMActivity<VM extends BaseViewModel<State>, State extends ViewData, VB extends InterfaceC8209a> extends e {
    public static final Companion Companion;
    public static final long DISCONNECT_TIMEOUT = 300000;
    public static final String PAGE_KEY = "BaseMvvmActivity";
    private static Timer disconnectTimer;
    private static boolean isInvisible;
    public VB binding;
    private final com.trello.rxlifecycle2.b<AbstractC1565i.b> lifecycleProvider;
    private boolean logoutDisabled;
    private VM theViewModel;

    /* compiled from: BaseMVVMActivity.kt */
    @Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u001b\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m10421d2 = {"Lai/kudi/agent/core/mvvm/BaseMVVMActivity$Companion;", "", "()V", "DISCONNECT_TIMEOUT", "", "TAG", "", "disconnectTimer", "Ljava/util/Timer;", "getDisconnectTimer", "()Ljava/util/Timer;", "setDisconnectTimer", "(Ljava/util/Timer;)V", "isInvisible", "", "disconnectTask", "Ljava/util/TimerTask;", "context", "Landroid/app/Activity;", "getUserRepo", "Lai/kudi/agent/users/data/repositories/RoomUserRepository;", "Landroid/content/Context;", "logout", "", "navigateToNotification", "resetDisconnectTimer", "showLogin", "stopDisconnectTimer", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
            BaseMVVMActivity$Companion$disconnectTask$1 $r2 = new BaseMVVMActivity$Companion$disconnectTask$1(activity);
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
            Timer $r22 = new Timer();
            setDisconnectTimer($r22);
            Timer $r23 = getDisconnectTimer();
            TimerTask $r3 = disconnectTask(activity);
            $r23.schedule($r3, 300000L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final void showLogin(Activity activity) {
            try {
                Class $r2 = Class.forName("ai.kudi.agent.login.ui.LoginActivity");
                Intent $r1 = new Intent(activity, $r2);
                $r1.setFlags(268468224);
                activity.startActivity($r1);
            } catch (ClassNotFoundException $r4) {
                CrashlyticsReport.logException($r4);
            }
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final Timer getDisconnectTimer() {
            Timer $r1 = BaseMVVMActivity.disconnectTimer;
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
            boolean $z0 = BaseMVVMActivity.isInvisible;
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
                Class $r2 = Class.forName("ai.kudi.agent.notification.ui.NotificationActivity");
                Intent $r1 = new Intent(activity, $r2);
                activity.startActivity($r1);
            } catch (ClassNotFoundException $r4) {
                CrashlyticsReport.logException($r4);
            }
        }

        public final void setDisconnectTimer(Timer timer) {
            Log_OC.getArray(timer, "<set-?>");
            BaseMVVMActivity.disconnectTimer = timer;
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseMVVMActivity() {
        AndroidLifecycle.Companion $r2 = AndroidLifecycle.Companion;
        FileStorage $r1 = $r2.createLifecycleProvider(this);
        this.lifecycleProvider = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m39156onCreate$lambda0(BaseMVVMActivity baseMVVMActivity, ViewData viewData) {
        Log_OC.getArray(baseMVVMActivity, "this$0");
        Log_OC.loadImage(viewData, "it");
        baseMVVMActivity.applyViewData(viewData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onResume$lambda-2  reason: not valid java name */
    public static final void m39158onResume$lambda2(BaseMVVMActivity baseMVVMActivity, User user) {
        Log_OC.getArray(baseMVVMActivity, "this$0");
        Companion $r2 = Companion;
        $r2.resetDisconnectTimer(baseMVVMActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onResume$lambda-3  reason: not valid java name */
    public static final void m39159onResume$lambda3(BaseMVVMActivity baseMVVMActivity, Throwable th) {
        Log_OC.getArray(baseMVVMActivity, "this$0");
        Companion $r2 = Companion;
        $r2.showLogin(baseMVVMActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setTitle$lambda-4  reason: not valid java name */
    public static final void m39160setTitle$lambda4(BaseMVVMActivity baseMVVMActivity, CharSequence charSequence) {
        Log_OC.getArray(baseMVVMActivity, "this$0");
        Log_OC.getArray(charSequence, "$title");
        super.setTitle(charSequence);
    }

    protected abstract void applyViewData(ViewData viewData);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract BaseViewModel createViewModel();

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
    public final FileStorage getLifecycleProvider() {
        return this.lifecycleProvider;
    }

    protected abstract Class getVMType();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BaseViewModel getViewModel() {
        BaseViewModel $r1 = this.theViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("theViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC8209a $r3 = getActivityBinding();
        setBinding($r3);
        InterfaceC8209a $r32 = getBinding();
        View $r4 = $r32.getRoot();
        setContentView($r4);
        setRequestedOrientation(1);
        C1556g0 $r6 = C1564h0.c(this, new C1556g0.InterfaceC1559b() { // from class: ai.kudi.agent.core.mvvm.BaseMVVMActivity$onCreate$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public Extension create(Class cls) {
                Log_OC.getArray(cls, "modelClass");
                BaseMVVMActivity $r33 = BaseMVVMActivity.this;
                BaseViewModel $r1 = $r33.createViewModel();
                return $r1;
            }
        });
        Class $r7 = getVMType();
        Extension $r8 = $r6.m35533a((Class<Extension>) $r7);
        Log_OC.loadImage($r8, "override fun onCreate(savedInstanceState: Bundle?) {\n        super.onCreate(savedInstanceState)\n        binding = activityBinding\n        setContentView(binding.root)\n        // all activities inheriting this class should be portrait\n        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT\n        theViewModel = ViewModelProviders.of(\n            this,\n            object : ViewModelProvider.Factory {\n                @Suppress(\"UNCHECKED_CAST\")\n                override fun <T : ViewModel?> create(modelClass: Class<T>): T {\n                    return createViewModel() as T\n                }\n            }\n        ).get(getVMType())\n        theViewModel.viewData.bindToLifecycle(lifecycleProvider).subscribe(\n            {\n                applyViewData(it)\n            },\n            {\n                it.printStackTrace()\n            }\n        )\n    }");
        VM vm = (VM) $r8;
        this.theViewModel = vm;
        if (vm == null) {
            Log_OC.LogError("theViewModel");
            NullPointerException r14 = new NullPointerException("Null throw statement replaced by Soot");
            throw r14;
        }
        C11678a $r10 = vm.getViewData();
        AbstractC11688p $r12 = C7392a.a((AbstractC11688p) $r10, (FileStorage) this.lifecycleProvider);
        Object object = new Object() { // from class: ai.kudi.agent.core.mvvm.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BaseMVVMActivity $r1 = BaseMVVMActivity.this;
                ViewData $r33 = (ViewData) obj;
                BaseMVVMActivity.m39156onCreate$lambda0($r1, $r33);
            }
        };
        Logger $r1 = Logger.logger;
        $r12.e0(object, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 == 16908332) {
            onBackPressed();
        }
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
    }

    protected void onPause() {
        super.onPause();
        isInvisible = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onResume() {
        super.onResume();
        Companion $r2 = Companion;
        isInvisible = false;
        boolean $z0 = this.logoutDisabled;
        if ($z0) {
            return;
        }
        RoomUserRepository $r3 = $r2.getUserRepo(this);
        AbstractC11696w $r4 = $r3.getCurrentUser();
        Item $r5 = ClassWriter.LogError();
        AbstractC11696w $r42 = $r4.u($r5);
        Item $r52 = ContextUtils.LogError();
        $r42.n($r52).s(new Object() { // from class: ai.kudi.agent.core.mvvm.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BaseMVVMActivity $r1 = BaseMVVMActivity.this;
                User $r32 = (User) obj;
                BaseMVVMActivity.m39158onResume$lambda2($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.core.mvvm.FileFilterUtil$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BaseMVVMActivity $r1 = BaseMVVMActivity.this;
                Throwable $r32 = (Throwable) obj;
                BaseMVVMActivity.m39159onResume$lambda3($r1, $r32);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onUserInteraction() {
        super.onUserInteraction();
        boolean $z0 = this.logoutDisabled;
        if ($z0) {
            return;
        }
        Companion $r1 = Companion;
        $r1.resetDisconnectTimer(this);
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
        $r3.post(new Runnable() { // from class: ai.kudi.agent.core.mvvm.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                BaseMVVMActivity $r1 = BaseMVVMActivity.this;
                CharSequence $r22 = charSequence;
                BaseMVVMActivity.m39160setTitle$lambda4($r1, $r22);
            }
        });
    }
}
