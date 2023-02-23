package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.data.repositories.dto.FetchRequest;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.domain.usecases.SendTransactionResponse;
import ai.kudi.agent.transactions.domain.usecases.SendTransactionToMail;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.transactions.views.EmailTransactionReportView;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p557z.C13726r;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: EmailTransactionReportPresenter.kt */
@Metadata(m10422d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0014J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rJ\u001c\u0010\u001c\u001a\u00020\u00142\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000e0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/transactions/presenters/EmailTransactionReportPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/transactions/views/EmailTransactionReportView;", "sendTransactionToMail", "Lai/kudi/agent/transactions/domain/usecases/SendTransactionToMail;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/transactions/domain/usecases/SendTransactionToMail;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "transactions", "", "Ljava/util/HashMap;", "", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "getTransactions", "()Ljava/util/List;", "setTransactions", "(Ljava/util/List;)V", "destroy", "", "getEmailAndShowBottomSheet", "isNotValidInputParams", "", TransactionField.STATUS, "type", "to", "from", "sendFilteredTransactionToMail", TransactionRequest.TYPE_REQUEST, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class EmailTransactionReportPresenter extends C9410b<EmailTransactionReportView> {
    private final C11280b compositeDisposable;
    private final FetchCurrentUser fetchCurrentUser;
    private final SendTransactionToMail sendTransactionToMail;
    private List<? extends HashMap<String, String>> transactions;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public EmailTransactionReportPresenter(SendTransactionToMail sendTransactionToMail, FetchCurrentUser fetchCurrentUser) {
        List $r2;
        Log_OC.getArray(sendTransactionToMail, "sendTransactionToMail");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.sendTransactionToMail = sendTransactionToMail;
        this.fetchCurrentUser = fetchCurrentUser;
        $r2 = C13726r.m3891e();
        this.transactions = $r2;
        C11280b $r4 = new C11280b();
        this.compositeDisposable = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getEmailAndShowBottomSheet$lambda-1  reason: not valid java name */
    public static final void m41147getEmailAndShowBottomSheet$lambda1(EmailTransactionReportPresenter emailTransactionReportPresenter, final User user) {
        Log_OC.getArray(emailTransactionReportPresenter, "this$0");
        emailTransactionReportPresenter.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.Contact
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void refresh(Object obj) {
                User $r1 = User.this;
                EmailTransactionReportView $r3 = (EmailTransactionReportView) obj;
                EmailTransactionReportPresenter.m41148getEmailAndShowBottomSheet$lambda1$lambda0($r1, $r3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getEmailAndShowBottomSheet$lambda-1$lambda-0  reason: not valid java name */
    public static final void m41148getEmailAndShowBottomSheet$lambda1$lambda0(User user, EmailTransactionReportView emailTransactionReportView) {
        Log_OC.getArray(emailTransactionReportView, "it");
        String $r1 = user.getEmail();
        String $r3 = $r1;
        if ($r1 == null) {
            $r3 = "";
        }
        emailTransactionReportView.showBottomSheet($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isNotValidInputParams$lambda-10  reason: not valid java name */
    public static final void m41150isNotValidInputParams$lambda10(EmailTransactionReportView emailTransactionReportView) {
        Log_OC.getArray(emailTransactionReportView, "it");
        emailTransactionReportView.showError("from");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isNotValidInputParams$lambda-7  reason: not valid java name */
    public static final void m41151isNotValidInputParams$lambda7(EmailTransactionReportView emailTransactionReportView) {
        Log_OC.getArray(emailTransactionReportView, "it");
        emailTransactionReportView.showError(TransactionField.STATUS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isNotValidInputParams$lambda-8  reason: not valid java name */
    public static final void m41152isNotValidInputParams$lambda8(EmailTransactionReportView emailTransactionReportView) {
        Log_OC.getArray(emailTransactionReportView, "it");
        emailTransactionReportView.showError("type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isNotValidInputParams$lambda-9  reason: not valid java name */
    public static final void m41153isNotValidInputParams$lambda9(EmailTransactionReportView emailTransactionReportView) {
        Log_OC.getArray(emailTransactionReportView, "it");
        emailTransactionReportView.showError("to");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendFilteredTransactionToMail$lambda-6  reason: not valid java name */
    public static final void m41154sendFilteredTransactionToMail$lambda6(final Map map, final EmailTransactionReportPresenter emailTransactionReportPresenter, final EmailTransactionReportView emailTransactionReportView) {
        boolean $z1;
        Log_OC.getArray(map, "$request");
        Log_OC.getArray(emailTransactionReportPresenter, "this$0");
        Log_OC.getArray(emailTransactionReportView, "view");
        boolean $z0 = true;
        emailTransactionReportView.downloadStatus(true);
        Object $r3 = map.get("email");
        CharSequence $r4 = (CharSequence) $r3;
        if ($r4 != null) {
            $z1 = C13276s.m5440u($r4);
            if (!$z1) {
                $z0 = false;
            }
        }
        if ($z0 || !emailTransactionReportPresenter.isViewAttached()) {
            emailTransactionReportView.downloadStatus(false);
            emailTransactionReportView.showFeedbackMsg("Please enter email address");
            return;
        }
        FetchCurrentUser $r5 = emailTransactionReportPresenter.fetchCurrentUser;
        AbstractC11696w $r6 = FetchCurrentUser.execute$default($r5, null, null, 3, null);
        AbstractC11688p $r8 = $r6.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.transactions.presenters.x
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                EmailTransactionReportPresenter $r1 = EmailTransactionReportPresenter.this;
                Map $r2 = map;
                User $r52 = (User) obj;
                InterfaceC11692s $r32 = EmailTransactionReportPresenter.m41155sendFilteredTransactionToMail$lambda6$lambda3($r1, $r2, $r52);
                return $r32;
            }
        });
        FavoritesArrayAdapter $r11 = $r8.e0(new Object() { // from class: ai.kudi.agent.transactions.presenters.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                EmailTransactionReportView $r1 = EmailTransactionReportView.this;
                SendTransactionResponse $r32 = (SendTransactionResponse) obj;
                EmailTransactionReportPresenter.m41156sendFilteredTransactionToMail$lambda6$lambda4($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.transactions.presenters.SocketConnector
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                EmailTransactionReportView $r1 = EmailTransactionReportView.this;
                Throwable $r32 = (Throwable) obj;
                EmailTransactionReportPresenter.m41157sendFilteredTransactionToMail$lambda6$lambda5($r1, $r32);
            }
        });
        C11280b $r12 = emailTransactionReportPresenter.compositeDisposable;
        $r12.b($r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendFilteredTransactionToMail$lambda-6$lambda-3  reason: not valid java name */
    public static final InterfaceC11692s m41155sendFilteredTransactionToMail$lambda6$lambda3(EmailTransactionReportPresenter emailTransactionReportPresenter, Map map, User user) {
        Log_OC.getArray(emailTransactionReportPresenter, "this$0");
        Log_OC.getArray(map, "$request");
        Log_OC.getArray(user, "it");
        SendTransactionToMail $r3 = emailTransactionReportPresenter.sendTransactionToMail;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        FetchRequest $r5 = new FetchRequest(map);
        AbstractC11688p $r6 = $r3.execute($r4, $r5);
        return $r6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendFilteredTransactionToMail$lambda-6$lambda-4  reason: not valid java name */
    public static final void m41156sendFilteredTransactionToMail$lambda6$lambda4(EmailTransactionReportView emailTransactionReportView, SendTransactionResponse sendTransactionResponse) {
        Log_OC.getArray(emailTransactionReportView, "$view");
        emailTransactionReportView.downloadStatus(false);
        String $r1 = sendTransactionResponse.getMessage();
        emailTransactionReportView.showFeedbackMsg($r1);
        emailTransactionReportView.toggleBottomSheet(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: sendFilteredTransactionToMail$lambda-6$lambda-5  reason: not valid java name */
    public static final void m41157sendFilteredTransactionToMail$lambda6$lambda5(EmailTransactionReportView emailTransactionReportView, Throwable th) {
        Log_OC.getArray(emailTransactionReportView, "$view");
        emailTransactionReportView.toggleBottomSheet(false);
        emailTransactionReportView.downloadStatus(false);
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default("Something went wrong. Please try again", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        emailTransactionReportView.showFeedbackMsg($r4);
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
    public final void getEmailAndShowBottomSheet() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.transactions.presenters.Macro
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                EmailTransactionReportPresenter $r12 = EmailTransactionReportPresenter.this;
                User $r3 = (User) obj;
                EmailTransactionReportPresenter.m41147getEmailAndShowBottomSheet$lambda1($r12, $r3);
            }
        };
        FormatedText $r4 = FormatedText.SINGLE_SPACE;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            { user ->\n                ifViewAttached {\n                    it.showBottomSheet(user.email.orEmpty())\n                }\n            },\n            {\n                Timber.i(it)\n            }\n        )");
        C11280b $r6 = this.compositeDisposable;
        $r6.b($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getTransactions() {
        List r1 = this.transactions;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isNotValidInputParams(String str, String str2, String str3, String str4) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        boolean $z04;
        Log_OC.getArray(str, TransactionField.STATUS);
        Log_OC.getArray(str2, "type");
        Log_OC.getArray(str3, "to");
        Log_OC.getArray(str4, "from");
        $z0 = C13276s.m5440u(str);
        if ($z0) {
            Compression $r5 = Compression.METADATA;
            ifViewAttached($r5);
            return true;
        }
        $z02 = C13276s.m5440u(str2);
        if ($z02) {
            Attribute $r6 = Attribute.attrs;
            ifViewAttached($r6);
            return true;
        }
        $z03 = C13276s.m5440u(str3);
        if ($z03) {
            Line $r7 = Line.attrs;
            ifViewAttached($r7);
            return true;
        }
        $z04 = C13276s.m5440u(str4);
        if ($z04) {
            ClassWriter $r8 = ClassWriter.attrs;
            ifViewAttached($r8);
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void sendFilteredTransactionToMail(final Map map) {
        Log_OC.getArray(map, TransactionRequest.TYPE_REQUEST);
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.transactions.presenters.ChessController
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void removeSubTree(Object obj) {
                Map $r1 = map;
                EmailTransactionReportPresenter $r2 = this;
                EmailTransactionReportView $r4 = (EmailTransactionReportView) obj;
                EmailTransactionReportPresenter.m41154sendFilteredTransactionToMail$lambda6($r1, $r2, $r4);
            }
        });
    }

    public final void setTransactions(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.transactions = list;
    }
}
