package ai.kudi.agent.transactions.viewmodels;

import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.transactions.data.Error;
import ai.kudi.agent.transactions.data.PendingVerificationCustomerDetailInputData;
import ai.kudi.agent.transactions.p032ui.VerificationNavigator;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: PendingVerificationCustomerDetailInputPresenter.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016JH\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0002JF\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/transactions/viewmodels/PendingVerificationCustomerDetailInputPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/transactions/data/PendingVerificationCustomerDetailInputData;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "verificationNavigator", "Lai/kudi/agent/transactions/ui/VerificationNavigator;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/transactions/ui/VerificationNavigator;)V", "agentPhoneNumber", "", "getAgentPhoneNumber", "()Ljava/lang/String;", "setAgentPhoneNumber", "(Ljava/lang/String;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "validateInputFields", "", "phoneNumber", "fullName", TransactionField.AMOUNT, "", "reason", "occupation", "idType", "idNo", "dob", "verifyCustomerDetail", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PendingVerificationCustomerDetailInputPresenter extends C9410b<PendingVerificationCustomerDetailInputData> {
    private String agentPhoneNumber;
    private final C11280b compositeDisposable;
    private final VerificationNavigator verificationNavigator;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public PendingVerificationCustomerDetailInputPresenter(FetchCurrentUser fetchCurrentUser, VerificationNavigator verificationNavigator) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(verificationNavigator, "verificationNavigator");
        this.verificationNavigator = verificationNavigator;
        this.agentPhoneNumber = "";
        C11280b $r3 = new C11280b();
        this.compositeDisposable = $r3;
        AbstractC11696w $r4 = FetchCurrentUser.execute$default(fetchCurrentUser, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.transactions.viewmodels.Socks5BytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                PendingVerificationCustomerDetailInputPresenter $r1 = PendingVerificationCustomerDetailInputPresenter.this;
                User $r32 = (User) obj;
                PendingVerificationCustomerDetailInputPresenter.m41260_init_$lambda0($r1, $r32);
            }
        };
        C0638b $r6 = C0638b.f1750e;
        FavoritesArrayAdapter $r7 = $r4.s(object, $r6);
        Log_OC.loadImage($r7, "currentUser.execute().subscribe(\n            {\n                agentPhoneNumber = it.phoneNumber\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r32 = this.compositeDisposable;
        RxExtKt.addTo($r7, $r32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m41260_init_$lambda0(PendingVerificationCustomerDetailInputPresenter pendingVerificationCustomerDetailInputPresenter, User user) {
        Log_OC.getArray(pendingVerificationCustomerDetailInputPresenter, "this$0");
        String $r1 = user.getPhoneNumber();
        Log_OC.loadImage($r1, "it.phoneNumber");
        pendingVerificationCustomerDetailInputPresenter.setAgentPhoneNumber($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean validateInputFields(String str, String str2, double d, String str3, String str4, String str5, String str6, String str7) {
        if (d > 500000.0d) {
            int $i1 = str3.length();
            boolean $z0 = $i1 == 0;
            if ($z0) {
                C0639c $r8 = C0639c.f1751d;
                ifViewAttached($r8);
                return false;
            }
            int $i12 = str4.length();
            boolean $z02 = $i12 == 0;
            if ($z02) {
                Target $r9 = Target.f1749a;
                ifViewAttached($r9);
                return false;
            }
        }
        if (d > 800000.0d) {
            int $i13 = str5.length();
            boolean $z03 = $i13 == 0;
            if ($z03) {
                Line $r10 = Line.next;
                ifViewAttached($r10);
                return false;
            }
            int $i14 = str6.length();
            boolean $z04 = $i14 == 0;
            if ($z04) {
                Function $r11 = Function.TYPE;
                ifViewAttached($r11);
                return false;
            }
            int $i15 = str7.length();
            boolean $z05 = $i15 == 0;
            if ($z05) {
                Compression $r12 = Compression.METADATA;
                ifViewAttached($r12);
                return false;
            }
        }
        int $i16 = str2.length();
        boolean $z06 = $i16 == 0;
        if ($z06) {
            ClassWriter $r13 = ClassWriter.f1740b;
            ifViewAttached($r13);
            return false;
        }
        int $i17 = str.length();
        boolean $z07 = $i17 == 0;
        if ($z07) {
            Observable $r14 = Observable.f1747o;
            ifViewAttached($r14);
            return false;
        }
        boolean $z08 = StringExtKt.isNigerianPhoneNumber(str);
        if (!$z08) {
            RFC4519Style $r15 = RFC4519Style.f1748o;
            ifViewAttached($r15);
            return false;
        }
        String $r6 = this.agentPhoneNumber;
        boolean $z09 = Log_OC.append(str, $r6);
        if ($z09) {
            Token $r16 = Token.BOOL;
            ifViewAttached($r16);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateInputFields$lambda-10  reason: not valid java name */
    public static final void m41262validateInputFields$lambda10(PendingVerificationCustomerDetailInputData pendingVerificationCustomerDetailInputData) {
        Log_OC.getArray(pendingVerificationCustomerDetailInputData, "it");
        Error $r1 = new Error("You cannot provide your phone number", null, null, null, null, null, null, null, null, 510, null);
        pendingVerificationCustomerDetailInputData.showError($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateInputFields$lambda-2  reason: not valid java name */
    public static final void m41263validateInputFields$lambda2(PendingVerificationCustomerDetailInputData pendingVerificationCustomerDetailInputData) {
        Log_OC.getArray(pendingVerificationCustomerDetailInputData, "it");
        Error $r1 = new Error(null, null, null, null, "Reason is required", null, null, null, null, 495, null);
        pendingVerificationCustomerDetailInputData.showError($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateInputFields$lambda-3  reason: not valid java name */
    public static final void m41264validateInputFields$lambda3(PendingVerificationCustomerDetailInputData pendingVerificationCustomerDetailInputData) {
        Log_OC.getArray(pendingVerificationCustomerDetailInputData, "it");
        Error $r1 = new Error(null, null, null, "Occupation is required", null, null, null, null, null, 503, null);
        pendingVerificationCustomerDetailInputData.showError($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateInputFields$lambda-4  reason: not valid java name */
    public static final void m41265validateInputFields$lambda4(PendingVerificationCustomerDetailInputData pendingVerificationCustomerDetailInputData) {
        Log_OC.getArray(pendingVerificationCustomerDetailInputData, "it");
        Error $r1 = new Error(null, null, null, null, null, "IdType is required", null, null, null, 479, null);
        pendingVerificationCustomerDetailInputData.showError($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateInputFields$lambda-5  reason: not valid java name */
    public static final void m41266validateInputFields$lambda5(PendingVerificationCustomerDetailInputData pendingVerificationCustomerDetailInputData) {
        Log_OC.getArray(pendingVerificationCustomerDetailInputData, "it");
        Error $r1 = new Error(null, null, null, null, null, null, "Id Number is required", null, null, 447, null);
        pendingVerificationCustomerDetailInputData.showError($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateInputFields$lambda-6  reason: not valid java name */
    public static final void m41267validateInputFields$lambda6(PendingVerificationCustomerDetailInputData pendingVerificationCustomerDetailInputData) {
        Log_OC.getArray(pendingVerificationCustomerDetailInputData, "it");
        Error $r1 = new Error(null, null, null, null, null, null, null, "Date of birth is required", null, 383, null);
        pendingVerificationCustomerDetailInputData.showError($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateInputFields$lambda-7  reason: not valid java name */
    public static final void m41268validateInputFields$lambda7(PendingVerificationCustomerDetailInputData pendingVerificationCustomerDetailInputData) {
        Log_OC.getArray(pendingVerificationCustomerDetailInputData, "it");
        Error $r1 = new Error(null, "Full name is required", null, null, null, null, null, null, null, 509, null);
        pendingVerificationCustomerDetailInputData.showError($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateInputFields$lambda-8  reason: not valid java name */
    public static final void m41269validateInputFields$lambda8(PendingVerificationCustomerDetailInputData pendingVerificationCustomerDetailInputData) {
        Log_OC.getArray(pendingVerificationCustomerDetailInputData, "it");
        Error $r1 = new Error("Phone number is required", null, null, null, null, null, null, null, null, 510, null);
        pendingVerificationCustomerDetailInputData.showError($r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: validateInputFields$lambda-9  reason: not valid java name */
    public static final void m41270validateInputFields$lambda9(PendingVerificationCustomerDetailInputData pendingVerificationCustomerDetailInputData) {
        Log_OC.getArray(pendingVerificationCustomerDetailInputData, "it");
        Error $r1 = new Error("Phone number is invalid", null, null, null, null, null, null, null, null, 510, null);
        pendingVerificationCustomerDetailInputData.showError($r1);
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
    public final String getAgentPhoneNumber() {
        String r1 = this.agentPhoneNumber;
        return r1;
    }

    public final void setAgentPhoneNumber(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.agentPhoneNumber = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void verifyCustomerDetail(String str, String str2, double d, String str3, String str4, String str5, String str6, String str7) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "fullName");
        Log_OC.getArray(str3, "reason");
        Log_OC.getArray(str4, "occupation");
        Log_OC.getArray(str5, "idType");
        Log_OC.getArray(str6, "idNo");
        Log_OC.getArray(str7, "dob");
        boolean $z0 = validateInputFields(str, str2, d, str3, str4, str5, str6, str7);
        if ($z0) {
            VerificationNavigator $r8 = this.verificationNavigator;
            $r8.navigateToPictureUpload(str2, str, str3, str4, str5, str6, str7);
        }
    }
}
