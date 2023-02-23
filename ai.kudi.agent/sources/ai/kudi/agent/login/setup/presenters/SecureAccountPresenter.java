package ai.kudi.agent.login.setup.presenters;

import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.login.setup.domain.AddDevice;
import ai.kudi.agent.login.setup.views.SecureAccountView;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: SecureAccountPresenter.kt */
@Metadata(m10422d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/login/setup/presenters/SecureAccountPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/login/setup/views/SecureAccountView;", "addDevice", "Lai/kudi/agent/login/setup/domain/AddDevice;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/login/setup/domain/AddDevice;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCurrentUser", "()Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "destroy", "", "secureAccount", "deviceName", "", "deviceId", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SecureAccountPresenter extends C9410b<SecureAccountView> {
    private final AddDevice addDevice;
    private final C11280b compositeDisposable;
    private final FetchCurrentUser currentUser;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SecureAccountPresenter(AddDevice addDevice, FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(addDevice, "addDevice");
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        this.addDevice = addDevice;
        this.currentUser = fetchCurrentUser;
        C11280b $r3 = new C11280b();
        this.compositeDisposable = $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: secureAccount$lambda-0  reason: not valid java name */
    public static final void m39757secureAccount$lambda0(SecureAccountView secureAccountView) {
        Log_OC.getArray(secureAccountView, "view");
        secureAccountView.showProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: secureAccount$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m39758secureAccount$lambda1(SecureAccountPresenter secureAccountPresenter, String str, String str2, User user) {
        Log_OC.getArray(secureAccountPresenter, "this$0");
        Log_OC.getArray(str, "$deviceName");
        Log_OC.getArray(str2, "$deviceId");
        Log_OC.getArray(user, "it");
        AddDevice $r4 = secureAccountPresenter.addDevice;
        String $r6 = user.getSessionId();
        Log_OC.loadImage($r6, "it.sessionId");
        AddDevice.Input $r5 = new AddDevice.Input(str, str2, $r6);
        AbstractC11688p $r7 = $r4.execute($r5);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: secureAccount$lambda-3  reason: not valid java name */
    public static final void m39759secureAccount$lambda3(SecureAccountPresenter secureAccountPresenter, final Boolean bool) {
        Log_OC.getArray(secureAccountPresenter, "this$0");
        secureAccountPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.login.setup.presenters.Type
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                Boolean $r1 = bool;
                SecureAccountView $r3 = (SecureAccountView) obj;
                SecureAccountPresenter.m39760secureAccount$lambda3$lambda2($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: secureAccount$lambda-3$lambda-2  reason: not valid java name */
    public static final void m39760secureAccount$lambda3$lambda2(Boolean bool, SecureAccountView secureAccountView) {
        Log_OC.getArray(secureAccountView, "view");
        secureAccountView.hideProgress();
        Log_OC.loadImage(bool, "isUpdated");
        boolean $z0 = bool.booleanValue();
        if ($z0) {
            secureAccountView.navigateToDashBoard();
        } else {
            secureAccountView.showError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: secureAccount$lambda-5  reason: not valid java name */
    public static final void m39761secureAccount$lambda5(SecureAccountPresenter secureAccountPresenter, Throwable th) {
        Log_OC.getArray(secureAccountPresenter, "this$0");
        th.printStackTrace();
        ClassWriter $r2 = ClassWriter.f632b;
        secureAccountPresenter.ifViewAttached($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: secureAccount$lambda-5$lambda-4  reason: not valid java name */
    public static final void m39762secureAccount$lambda5$lambda4(SecureAccountView secureAccountView) {
        Log_OC.getArray(secureAccountView, "view");
        secureAccountView.showError();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FetchCurrentUser getCurrentUser() {
        FetchCurrentUser r1 = this.currentUser;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void secureAccount(final String str, final String str2) {
        Log_OC.getArray(str, "deviceName");
        Log_OC.getArray(str2, "deviceId");
        Main $r3 = Main.phone;
        ifViewAttached($r3);
        FetchCurrentUser $r4 = this.currentUser;
        AbstractC11696w $r5 = FetchCurrentUser.execute$default($r4, null, null, 3, null);
        AbstractC11688p $r7 = $r5.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.login.setup.presenters.MethodWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                SecureAccountPresenter $r1 = SecureAccountPresenter.this;
                String $r2 = str;
                String $r32 = str2;
                User $r6 = (User) obj;
                InterfaceC11692s $r42 = SecureAccountPresenter.m39758secureAccount$lambda1($r1, $r2, $r32, $r6);
                return $r42;
            }
        });
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.login.setup.presenters.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SecureAccountPresenter $r1 = SecureAccountPresenter.this;
                Boolean $r32 = (Boolean) obj;
                SecureAccountPresenter.m39759secureAccount$lambda3($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.login.setup.presenters.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                SecureAccountPresenter $r1 = SecureAccountPresenter.this;
                Throwable $r32 = (Throwable) obj;
                SecureAccountPresenter.m39761secureAccount$lambda5($r1, $r32);
            }
        });
        Log_OC.loadImage($r10, "currentUser.execute()\n            .flatMapObservable {\n                addDevice.execute(AddDevice.Input(deviceName, deviceId, it.sessionId))\n            }\n            .subscribe(\n                { isUpdated ->\n                    ifViewAttached { view ->\n                        view.hideProgress()\n                        if (isUpdated) {\n                            view.navigateToDashBoard()\n                        } else {\n                            view.showError()\n                        }\n                    }\n                },\n                { err ->\n                    err.printStackTrace()\n                    ifViewAttached { view ->\n                        view.showError() //todo change this back to showError\n                    }\n                }\n            )");
        C11280b $r11 = this.compositeDisposable;
        RxExtKt.addTo($r10, $r11);
    }
}
