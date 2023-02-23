package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: TermsAndAndConditionsViewModel.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/issues/ui/viewModels/TermsAndAndConditionsViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/issues/ui/viewModels/TermsAndAndConditionsViewModel$TermsAndConditionsViewData;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;)V", "userDisposable", "Lio/reactivex/disposables/Disposable;", "fetchUserDetails", "", "initialData", "onCleared", "TermsAndConditionsViewData", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.viewModels.TermsAndAndConditionsViewModel */
/* loaded from: classes.dex */
public final class TermsAndAndConditionsViewModel extends BaseViewModel<TermsAndConditionsViewData> {
    private final FetchCurrentUser fetchCurrentUser;
    private FavoritesArrayAdapter userDisposable;

    /* compiled from: TermsAndAndConditionsViewModel.kt */
    @Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/issues/ui/viewModels/TermsAndAndConditionsViewModel$TermsAndConditionsViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "firstName", "", "lastName", "signUpDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getSignUpDate", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.issues.ui.viewModels.TermsAndAndConditionsViewModel$TermsAndConditionsViewData */
    /* loaded from: classes.dex */
    public static final class TermsAndConditionsViewData implements ViewData {
        private final String firstName;
        private final String lastName;
        private final String signUpDate;

        public TermsAndConditionsViewData() {
            this(null, null, null, 7, null);
        }

        public TermsAndConditionsViewData(String str, String str2, String str3) {
            this.firstName = str;
            this.lastName = str2;
            this.signUpDate = str3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ TermsAndConditionsViewData(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, kotlin.p483e0.p485d.DBUtils$1 r6) {
            /*
                r1 = this;
                r0 = r5 & 1
                if (r0 == 0) goto L5
                r2 = 0
            L5:
                r0 = r5 & 2
                if (r0 == 0) goto La
                r3 = 0
            La:
                r5 = r5 & 4
                if (r5 == 0) goto Lf
                r4 = 0
            Lf:
                r1.<init>(r2, r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.viewModels.TermsAndAndConditionsViewModel.TermsAndConditionsViewData.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.e0.d.DBUtils$1):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ TermsAndConditionsViewData copy$default(TermsAndConditionsViewData termsAndConditionsViewData, String $r1, String $r2, String $r3, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r1 = termsAndConditionsViewData.firstName;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r2 = termsAndConditionsViewData.lastName;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r3 = termsAndConditionsViewData.signUpDate;
            }
            TermsAndConditionsViewData $r0 = termsAndConditionsViewData.copy($r1, $r2, $r3);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component1() {
            String r1 = this.firstName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component2() {
            String r1 = this.lastName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String component3() {
            String r1 = this.signUpDate;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TermsAndConditionsViewData copy(String str, String str2, String str3) {
            TermsAndConditionsViewData $r0 = new TermsAndConditionsViewData(str, str2, str3);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean $z0 = obj instanceof TermsAndConditionsViewData;
            if ($z0) {
                TermsAndConditionsViewData $r2 = (TermsAndConditionsViewData) obj;
                String $r3 = this.firstName;
                String $r4 = $r2.firstName;
                boolean $z02 = Log_OC.append($r3, $r4);
                if ($z02) {
                    String $r32 = this.lastName;
                    String $r42 = $r2.lastName;
                    boolean $z03 = Log_OC.append($r32, $r42);
                    if ($z03) {
                        String $r33 = this.signUpDate;
                        String $r43 = $r2.signUpDate;
                        boolean $z04 = Log_OC.append($r33, $r43);
                        return $z04;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getFirstName() {
            String r1 = this.firstName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getLastName() {
            String r1 = this.lastName;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getSignUpDate() {
            String r1 = this.signUpDate;
            return r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public int hashCode() {
            String $r1 = this.firstName;
            int $i1 = $r1 == null ? 0 : $r1.hashCode();
            int $i12 = $i1 * 31;
            String $r12 = this.lastName;
            int $i2 = $r12 == null ? 0 : $r12.hashCode();
            int $i13 = ($i12 + $i2) * 31;
            String $r13 = this.signUpDate;
            int $i0 = $r13 != null ? $r13.hashCode() : 0;
            return $i13 + $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public String toString() {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("TermsAndConditionsViewData(firstName=");
            String $r1 = this.firstName;
            $r2.append((Object) $r1);
            $r2.append(", lastName=");
            String $r12 = this.lastName;
            $r2.append((Object) $r12);
            $r2.append(", signUpDate=");
            String $r13 = this.signUpDate;
            $r2.append((Object) $r13);
            $r2.append(')');
            String $r14 = $r2.toString();
            return $r14;
        }
    }

    public TermsAndAndConditionsViewModel(FetchCurrentUser fetchCurrentUser) {
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        this.fetchCurrentUser = fetchCurrentUser;
        fetchUserDetails();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void fetchUserDetails() {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TermsAndAndConditionsViewModel $r12 = TermsAndAndConditionsViewModel.this;
                User $r3 = (User) obj;
                TermsAndAndConditionsViewModel.m39557fetchUserDetails$lambda0($r12, $r3);
            }
        };
        Log $r4 = Log.LOG;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        this.userDisposable = $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchUserDetails$lambda-0  reason: not valid java name */
    public static final void m39557fetchUserDetails$lambda0(TermsAndAndConditionsViewModel termsAndAndConditionsViewModel, User user) {
        Log_OC.getArray(termsAndAndConditionsViewModel, "this$0");
        ViewData $r2 = termsAndAndConditionsViewModel.getState();
        TermsAndConditionsViewData $r3 = (TermsAndConditionsViewData) $r2;
        String $r4 = user.getFirstName();
        String $r5 = user.getLastName();
        String $r6 = user.timeCreated;
        termsAndAndConditionsViewModel.publish($r3.copy($r4, $r5, $r6));
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        TermsAndConditionsViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public TermsAndConditionsViewData initialData() {
        TermsAndConditionsViewData $r1 = new TermsAndConditionsViewData(null, null, null, 7, null);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public void onCleared() {
        super.onCleared();
        FavoritesArrayAdapter $r1 = this.userDisposable;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }
}
