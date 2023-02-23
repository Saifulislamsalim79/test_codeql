package ai.kudi.agent.core.mvvm;

import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.PreferenceActivity;
import androidx.lifecycle.Scope;
import androidx.lifecycle.n;
import com.trello.lifecycle2.android.lifecycle.C7380a;
import com.trello.rxlifecycle2.C7386c;
import com.trello.rxlifecycle2.C7387d;
import com.trello.rxlifecycle2.FileStorage;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p471k0.C11678a;
/* compiled from: AndroidLifecycle.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B\u000f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\fH\u0017J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0017J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0017J\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0002H\u0001¢\u0006\u0002\b\u0013R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00020\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/core/mvvm/AndroidLifecycle;", "Lcom/trello/rxlifecycle2/LifecycleProvider;", "Landroidx/lifecycle/Lifecycle$Event;", "Landroidx/lifecycle/LifecycleObserver;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycleSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "bindToLifecycle", "Lcom/trello/rxlifecycle2/LifecycleTransformer;", "T", "bindUntilEvent", "event", "lifecycle", "Lio/reactivex/Observable;", "onEvent", "", "onEvent$core_release", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidLifecycle implements com.trello.rxlifecycle2.b<AbstractC1565i.b>, n {
    public static final Companion Companion;
    private final C11678a<AbstractC1565i.b> lifecycleSubject;

    /* compiled from: AndroidLifecycle.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/core/mvvm/AndroidLifecycle$Companion;", "", "()V", "createLifecycleProvider", "Lcom/trello/rxlifecycle2/LifecycleProvider;", "Landroidx/lifecycle/Lifecycle$Event;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final FileStorage createLifecycleProvider(PreferenceActivity preferenceActivity) {
            Log_OC.getArray(preferenceActivity, "owner");
            AndroidLifecycle $r2 = new AndroidLifecycle(preferenceActivity, null);
            return $r2;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private AndroidLifecycle(PreferenceActivity preferenceActivity) {
        C11678a $r2 = C11678a.m10575v0();
        Log_OC.loadImage($r2, "create<Lifecycle.Event>()");
        this.lifecycleSubject = $r2;
        AbstractC1565i $r3 = preferenceActivity.getLifecycle();
        $r3.a(this);
    }

    public /* synthetic */ AndroidLifecycle(PreferenceActivity preferenceActivity, DBUtils$1 dBUtils$1) {
        this(preferenceActivity);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C7386c bindToLifecycle() {
        C11678a $r2 = this.lifecycleSubject;
        C7386c $r1 = C7380a.m18827a($r2);
        Log_OC.loadImage($r1, "bindLifecycle(lifecycleSubject)");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C7386c bindUntilEvent(Scope scope) {
        Log_OC.getArray(scope, "event");
        C11678a $r3 = this.lifecycleSubject;
        C7386c $r1 = C7387d.m18821c($r3, scope);
        Log_OC.loadImage($r1, "bindUntilEvent(lifecycleSubject, event)");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* bridge */ /* synthetic */ C7386c bindUntilEvent(Object obj) {
        Scope $r3 = (Scope) obj;
        C7386c $r1 = bindUntilEvent($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p lifecycle() {
        C11678a $r2 = this.lifecycleSubject;
        AbstractC11688p $r1 = $r2.m10534L();
        Log_OC.loadImage($r1, "lifecycleSubject.hide()");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onEvent$core_release(PreferenceActivity preferenceActivity, Scope scope) {
        Log_OC.getArray(preferenceActivity, "owner");
        Log_OC.getArray(scope, "event");
        C11678a $r4 = this.lifecycleSubject;
        $r4.mo331f(scope);
        Scope $r5 = Scope.ON_DESTROY;
        if (scope == $r5) {
            AbstractC1565i $r2 = preferenceActivity.getLifecycle();
            $r2.c(this);
        }
    }
}
