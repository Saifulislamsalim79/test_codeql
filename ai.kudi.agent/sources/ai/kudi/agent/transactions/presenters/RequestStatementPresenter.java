package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.domain.dto.RequestStatementRequest;
import ai.kudi.agent.transactions.domain.dto.RequestStatementResponse;
import ai.kudi.agent.transactions.domain.usecases.RequestStatement;
import ai.kudi.agent.transactions.views.RequestStatementView;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: RequestStatementPresenter.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u001e\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000bR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/transactions/presenters/RequestStatementPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/transactions/views/RequestStatementView;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "requestStatement", "Lai/kudi/agent/transactions/domain/usecases/RequestStatement;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/transactions/domain/usecases/RequestStatement;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "isRequestStatementInputParamsValid", "", "from", "", "to", "emailAddress", "showEmailBottomSheet", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RequestStatementPresenter extends C9410b<RequestStatementView> {
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private final RequestStatement requestStatement;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RequestStatementPresenter(FetchCurrentUser fetchCurrentUser, RequestStatement requestStatement) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(requestStatement, "requestStatement");
        this.fetchCurrentUser = fetchCurrentUser;
        this.requestStatement = requestStatement;
        C11280b $r3 = new C11280b();
        this.compositeDisposable = $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isRequestStatementInputParamsValid$lambda-6  reason: not valid java name */
    public static final void m41166isRequestStatementInputParamsValid$lambda6(RequestStatementView requestStatementView) {
        Log_OC.getArray(requestStatementView, "it");
        requestStatementView.showError("from");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isRequestStatementInputParamsValid$lambda-7  reason: not valid java name */
    public static final void m41167isRequestStatementInputParamsValid$lambda7(RequestStatementView requestStatementView) {
        Log_OC.getArray(requestStatementView, "it");
        requestStatementView.showError("to");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestStatement$lambda-0  reason: not valid java name */
    public static final void m41168requestStatement$lambda0(RequestStatementView requestStatementView) {
        Log_OC.getArray(requestStatementView, "it");
        requestStatementView.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: requestStatement$lambda-1  reason: not valid java name */
    public static final InterfaceC11692s m41169requestStatement$lambda1(RequestStatementPresenter requestStatementPresenter, String str, String str2, String str3, User user) {
        Log_OC.getArray(requestStatementPresenter, "this$0");
        Log_OC.getArray(str, "$emailAddress");
        Log_OC.getArray(str2, "$from");
        Log_OC.getArray(str3, "$to");
        Log_OC.getArray(user, "it");
        RequestStatement $r5 = requestStatementPresenter.requestStatement;
        String $r6 = user.getSessionId();
        Log_OC.loadImage($r6, "it.sessionId");
        String $r7 = user.getPhoneNumber();
        Log_OC.loadImage($r7, "phoneNumber");
        RequestStatementRequest $r8 = new RequestStatementRequest(str, str2, $r7, str3);
        AbstractC11688p $r9 = $r5.excecute($r6, $r8);
        return $r9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: requestStatement$lambda-3  reason: not valid java name */
    public static final void m41170requestStatement$lambda3(RequestStatementPresenter requestStatementPresenter, final RequestStatementResponse requestStatementResponse) {
        Log_OC.getArray(requestStatementPresenter, "this$0");
        requestStatementPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.ModulusCheckDigit
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void calculate(Object obj) {
                RequestStatementResponse $r1 = RequestStatementResponse.this;
                RequestStatementView $r3 = (RequestStatementView) obj;
                RequestStatementPresenter.m41171requestStatement$lambda3$lambda2($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: requestStatement$lambda-3$lambda-2  reason: not valid java name */
    public static final void m41171requestStatement$lambda3$lambda2(RequestStatementResponse requestStatementResponse, RequestStatementView requestStatementView) {
        Log_OC.getArray(requestStatementView, "view");
        requestStatementView.hideLoading();
        String $r1 = requestStatementResponse.getMsg();
        requestStatementView.showFeedbackMsg($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: requestStatement$lambda-5  reason: not valid java name */
    public static final void m41172requestStatement$lambda5(RequestStatementPresenter requestStatementPresenter, final String str, final Throwable th) {
        Log_OC.getArray(requestStatementPresenter, "this$0");
        Log_OC.getArray(str, "$emailAddress");
        Log_OC.loadImage(th, "e");
        CrashlyticsReport.logException(th);
        requestStatementPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.ByteVector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                String $r1 = str;
                Throwable $r2 = th;
                RequestStatementView $r4 = (RequestStatementView) obj;
                RequestStatementPresenter.m41173requestStatement$lambda5$lambda4($r1, $r2, $r4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: requestStatement$lambda-5$lambda-4  reason: not valid java name */
    public static final void m41173requestStatement$lambda5$lambda4(String str, Throwable th, RequestStatementView requestStatementView) {
        Log_OC.getArray(str, "$emailAddress");
        Log_OC.getArray(requestStatementView, "it");
        requestStatementView.hideLoading();
        String $r2 = Log_OC.m10359a("Couldn't send mail to ", (Object) str);
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default($r2, null, 2, null);
        Log_OC.loadImage(th, "e");
        Object $r4 = $r3.invoke(th);
        String $r22 = (String) $r4;
        requestStatementView.showFeedbackMsg($r22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showEmailBottomSheet$lambda-9  reason: not valid java name */
    public static final void m41175showEmailBottomSheet$lambda9(RequestStatementPresenter requestStatementPresenter, final User user) {
        Log_OC.getArray(requestStatementPresenter, "this$0");
        requestStatementPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.Element
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void removeChild(Object obj) {
                User $r1 = User.this;
                RequestStatementView $r3 = (RequestStatementView) obj;
                RequestStatementPresenter.m41176showEmailBottomSheet$lambda9$lambda8($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showEmailBottomSheet$lambda-9$lambda-8  reason: not valid java name */
    public static final void m41176showEmailBottomSheet$lambda9$lambda8(User user, RequestStatementView requestStatementView) {
        Log_OC.getArray(requestStatementView, "it");
        String $r1 = user.getEmail();
        String $r3 = $r1;
        if ($r1 == null) {
            $r3 = "";
        }
        requestStatementView.showBottomSheet($r3);
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
    public final boolean isRequestStatementInputParamsValid(String str, String str2) {
        boolean $z0;
        boolean $z02;
        Log_OC.getArray(str, "from");
        Log_OC.getArray(str2, "to");
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            Engine $r3 = Engine.instance;
            ifViewAttached($r3);
            return false;
        }
        $z02 = C13276s.m5440u(str2);
        if ($z02) {
            MainActivity$8 $r4 = MainActivity$8.DIRECT;
            ifViewAttached($r4);
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void requestStatement(final String str, final String str2, final String str3) {
        Log_OC.getArray(str, "emailAddress");
        Log_OC.getArray(str2, "from");
        Log_OC.getArray(str3, "to");
        MXParser $r4 = MXParser.f1673pc;
        ifViewAttached($r4);
        FetchCurrentUser $r5 = this.fetchCurrentUser;
        AbstractC11696w $r6 = FetchCurrentUser.execute$default($r5, null, null, 3, null);
        AbstractC11688p $r8 = $r6.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.presenters.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                RequestStatementPresenter $r1 = RequestStatementPresenter.this;
                String $r2 = str;
                String $r3 = str2;
                String $r42 = str3;
                User $r7 = (User) obj;
                InterfaceC11692s $r52 = RequestStatementPresenter.m41169requestStatement$lambda1($r1, $r2, $r3, $r42, $r7);
                return $r52;
            }
        });
        FavoritesArrayAdapter $r11 = $r8.e0(new Object() { // from class: ai.kudi.agent.transactions.presenters.ToContainsFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                RequestStatementPresenter $r1 = RequestStatementPresenter.this;
                RequestStatementResponse $r3 = (RequestStatementResponse) obj;
                RequestStatementPresenter.m41170requestStatement$lambda3($r1, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.transactions.presenters.Artist
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                RequestStatementPresenter $r1 = RequestStatementPresenter.this;
                String $r2 = str;
                Throwable $r42 = (Throwable) obj;
                RequestStatementPresenter.m41172requestStatement$lambda5($r1, $r2, $r42);
            }
        });
        C11280b $r12 = this.compositeDisposable;
        $r12.b($r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showEmailBottomSheet() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.transactions.presenters.Composer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                RequestStatementPresenter $r12 = RequestStatementPresenter.this;
                User $r3 = (User) obj;
                RequestStatementPresenter.m41175showEmailBottomSheet$lambda9($r12, $r3);
            }
        };
        SortField $r4 = SortField.DOC;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            { user ->\n                ifViewAttached {\n                    it.showBottomSheet(user.email.orEmpty())\n                }\n            },\n            {\n                Timber.i(it)\n            }\n        )");
        C11280b $r6 = this.compositeDisposable;
        $r6.b($r5);
    }
}
