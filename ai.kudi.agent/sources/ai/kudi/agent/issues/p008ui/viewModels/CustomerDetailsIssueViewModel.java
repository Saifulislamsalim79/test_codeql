package ai.kudi.agent.issues.p008ui.viewModels;

import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.issues.navigators.IssueTypeNavigator;
import ai.kudi.agent.issues.p008ui.viewModels.data.CustomerDetailsViewData;
import ai.kudi.agent.issues.viewmodels.model.IssueTypeModel;
import ai.kudi.agent.issues.viewmodels.model.WithdrawalTypes;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.AccountLookupRequest;
import ai.kudi.agent.users.domain.package_1.AccountLookupResponse;
import ai.kudi.agent.users.domain.usecases.AccountLookup;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: CustomerDetailsIssueViewModel.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J5\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\u0012JV\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016J+\u0010\u001f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010 J\u001c\u0010!\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fH\u0002J\u001e\u0010\"\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000fH\u0002J\u001c\u0010$\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010\u000fH\u0002J!\u0010&\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010'J\\\u0010(\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010)\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000fJ\b\u0010*\u001a\u00020\u001dH\u0014J\u0018\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m10421d2 = {"Lai/kudi/agent/issues/ui/viewModels/CustomerDetailsIssueViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/issues/ui/viewModels/data/CustomerDetailsViewData;", "issueTypeNavigator", "Lai/kudi/agent/issues/navigators/IssueTypeNavigator;", "accountLookup", "Lai/kudi/agent/users/domain/usecases/AccountLookup;", "(Lai/kudi/agent/issues/navigators/IssueTypeNavigator;Lai/kudi/agent/users/domain/usecases/AccountLookup;)V", "lookupDisposable", "Lio/reactivex/disposables/Disposable;", "accountDetailsValid", "", "customerBank", "Lai/kudi/agent/core/domain/room_entities/Bank;", "customerAccountNumber", "", "issueType", "shouldSettleCustomer", "(Lai/kudi/agent/core/domain/room_entities/Bank;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Z", "anyInvalidInputs", "customerName", "customerPhoneNumber", "issueTypeModel", "Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "transactionDate", TransactionField.AMOUNT, BanksWithMethods.ACCOUNT_NAME, "selectedBank", "disposeLookupProcess", "", "initialData", "isAccountNameValid", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Z", "isAmountValid", "isDateValid", AttributeType.DATE, "isInPutParamsValid", "customerPhone", "isShouldSettleCustomerSelected", "(Ljava/lang/String;Ljava/lang/Boolean;)Z", "navigateToIssueResolutionFragment", "isFromChargeBackDialog", "onCleared", "performLookup", "accountNo", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.viewModels.CustomerDetailsIssueViewModel */
/* loaded from: classes.dex */
public final class CustomerDetailsIssueViewModel extends BaseViewModel<CustomerDetailsViewData> {
    private final AccountLookup accountLookup;
    private final IssueTypeNavigator issueTypeNavigator;
    private FavoritesArrayAdapter lookupDisposable;

    public CustomerDetailsIssueViewModel(IssueTypeNavigator issueTypeNavigator, AccountLookup accountLookup) {
        Log_OC.getArray(issueTypeNavigator, "issueTypeNavigator");
        Log_OC.getArray(accountLookup, "accountLookup");
        this.issueTypeNavigator = issueTypeNavigator;
        this.accountLookup = accountLookup;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean accountDetailsValid(ai.kudi.agent.core.domain.room_entities.Bank r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.viewModels.CustomerDetailsIssueViewModel.accountDetailsValid(ai.kudi.agent.core.domain.room_entities.Bank, java.lang.String):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean accountDetailsValid(Bank bank, String str, String str2, Boolean bool) {
        boolean $z0 = accountDetailsValid(bank, str);
        if ($z0) {
            return true;
        }
        boolean $z02 = Log_OC.append(str2, WithdrawalTypes.USSD);
        if ($z02) {
            return false;
        }
        boolean $z03 = Log_OC.append(str2, WithdrawalTypes.USSD);
        if ($z03) {
            return true;
        }
        Boolean $r5 = Boolean.TRUE;
        boolean $z04 = Log_OC.append(bool, $r5);
        return !$z04;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean anyInvalidInputs(String str, String str2, IssueTypeModel issueTypeModel, String str3, String str4, String str5, Bank bank, String str6) {
        boolean $z0 = isInPutParamsValid(str, str2);
        if ($z0) {
            String $r5 = issueTypeModel.getType();
            boolean $z02 = isDateValid($r5, str3);
            if ($z02) {
                String $r52 = issueTypeModel.getType();
                boolean $z03 = isAmountValid($r52, str4);
                if ($z03) {
                    String $r53 = issueTypeModel.getType();
                    Boolean $r9 = issueTypeModel.getShouldSettleCustomer();
                    boolean $z04 = isAccountNameValid($r53, $r9, str5);
                    if ($z04) {
                        String $r54 = issueTypeModel.getType();
                        Boolean $r92 = issueTypeModel.getShouldSettleCustomer();
                        boolean $z05 = isShouldSettleCustomerSelected($r54, $r92);
                        if ($z05) {
                            String $r55 = issueTypeModel.getType();
                            Boolean $r93 = issueTypeModel.getShouldSettleCustomer();
                            boolean $z06 = accountDetailsValid(bank, str6, $r55, $r93);
                            return !$z06;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isAccountNameValid(java.lang.String r30, java.lang.Boolean r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.viewModels.CustomerDetailsIssueViewModel.isAccountNameValid(java.lang.String, java.lang.Boolean, java.lang.String):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isAmountValid(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            if (r31 == 0) goto Ld
            r0 = r31
            boolean r11 = kotlin.p549l0.C13265j.m5470u(r0)
            if (r11 == 0) goto Lb
            goto Ld
        Lb:
            r11 = 0
            goto Le
        Ld:
            r11 = 1
        Le:
            if (r11 == 0) goto L78
            java.lang.String r12 = "USSD-WITHDRAWAL"
            r0 = r30
            boolean r11 = kotlin.p483e0.p485d.Log_OC.append(r0, r12)
            if (r11 == 0) goto L78
            r0 = r29
            ai.kudi.agent.core.mvvm.ViewData r13 = r0.getState()
            r15 = r13
            ai.kudi.agent.issues.ui.viewModels.data.CustomerDetailsViewData r15 = (ai.kudi.agent.issues.p008ui.viewModels.data.CustomerDetailsViewData) r15
            r14 = r15
            ai.kudi.agent.issues.ui.viewModels.data.CustomerDetailsViewData$Error r16 = new ai.kudi.agent.issues.ui.viewModels.data.CustomerDetailsViewData$Error
            int r17 = ai.kudi.agent.feature_issue_resolution.C0214R.string.amount_blank_error
            r0 = r17
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 191(0xbf, float:2.68E-43)
            r27 = 0
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r18
            r8 = r25
            r9 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r26 = 0
            r19 = 0
            r28 = 3
            r20 = 0
            r0 = r14
            r1 = r26
            r2 = r19
            r3 = r16
            r4 = r28
            r5 = r20
            ai.kudi.agent.issues.ui.viewModels.data.CustomerDetailsViewData r14 = ai.kudi.agent.issues.p008ui.viewModels.data.CustomerDetailsViewData.copy$default(r0, r1, r2, r3, r4, r5)
            r0 = r29
            r0.publish(r14)
            r26 = 0
            return r26
        L78:
            r26 = 1
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.viewModels.CustomerDetailsIssueViewModel.isAmountValid(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isDateValid(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            if (r31 == 0) goto Ld
            r0 = r31
            boolean r11 = kotlin.p549l0.C13265j.m5470u(r0)
            if (r11 == 0) goto Lb
            goto Ld
        Lb:
            r11 = 0
            goto Le
        Ld:
            r11 = 1
        Le:
            if (r11 == 0) goto L78
            java.lang.String r12 = "USSD-WITHDRAWAL"
            r0 = r30
            boolean r11 = kotlin.p483e0.p485d.Log_OC.append(r0, r12)
            if (r11 == 0) goto L78
            r0 = r29
            ai.kudi.agent.core.mvvm.ViewData r13 = r0.getState()
            r15 = r13
            ai.kudi.agent.issues.ui.viewModels.data.CustomerDetailsViewData r15 = (ai.kudi.agent.issues.p008ui.viewModels.data.CustomerDetailsViewData) r15
            r14 = r15
            ai.kudi.agent.issues.ui.viewModels.data.CustomerDetailsViewData$Error r16 = new ai.kudi.agent.issues.ui.viewModels.data.CustomerDetailsViewData$Error
            int r17 = ai.kudi.agent.feature_issue_resolution.C0214R.string.date_blank_error
            r0 = r17
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 223(0xdf, float:3.12E-43)
            r27 = 0
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r18
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r26 = 0
            r19 = 0
            r28 = 3
            r20 = 0
            r0 = r14
            r1 = r26
            r2 = r19
            r3 = r16
            r4 = r28
            r5 = r20
            ai.kudi.agent.issues.ui.viewModels.data.CustomerDetailsViewData r14 = ai.kudi.agent.issues.p008ui.viewModels.data.CustomerDetailsViewData.copy$default(r0, r1, r2, r3, r4, r5)
            r0 = r29
            r0.publish(r14)
            r26 = 0
            return r26
        L78:
            r26 = 1
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.viewModels.CustomerDetailsIssueViewModel.isDateValid(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ boolean isDateValid$default(CustomerDetailsIssueViewModel customerDetailsIssueViewModel, String str, String $r3, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r3 = null;
        }
        boolean $z0 = customerDetailsIssueViewModel.isDateValid(str, $r3);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isInPutParamsValid(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.p008ui.viewModels.CustomerDetailsIssueViewModel.isInPutParamsValid(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isShouldSettleCustomerSelected(String str, Boolean bool) {
        if (bool == null) {
            boolean $z0 = Log_OC.append(str, WithdrawalTypes.USSD);
            if ($z0) {
                return true;
            }
            ViewData $r3 = getState();
            CustomerDetailsViewData $r4 = (CustomerDetailsViewData) $r3;
            int $i0 = C0214R.string.slect_an_option;
            Integer $r6 = Integer.valueOf($i0);
            CustomerDetailsViewData.Error $r5 = new CustomerDetailsViewData.Error(null, null, null, null, $r6, null, null, null, 239, null);
            publish(CustomerDetailsViewData.copy$default($r4, false, null, $r5, 3, null));
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLookup$lambda-1  reason: not valid java name */
    public static final void m39525performLookup$lambda1(CustomerDetailsIssueViewModel customerDetailsIssueViewModel, AccountLookupResponse accountLookupResponse) {
        Log_OC.getArray(customerDetailsIssueViewModel, "this$0");
        ViewData $r2 = customerDetailsIssueViewModel.getState();
        CustomerDetailsViewData $r3 = (CustomerDetailsViewData) $r2;
        String $r4 = accountLookupResponse.getAccountName();
        customerDetailsIssueViewModel.publish(CustomerDetailsViewData.copy$default($r3, false, $r4, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: performLookup$lambda-2  reason: not valid java name */
    public static final void m39526performLookup$lambda2(CustomerDetailsIssueViewModel customerDetailsIssueViewModel, Throwable th) {
        Log_OC.getArray(customerDetailsIssueViewModel, "this$0");
        th.printStackTrace();
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default("This account number does not exist on selected bank", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        ViewData $r6 = customerDetailsIssueViewModel.getState();
        CustomerDetailsViewData.Error $r1 = new CustomerDetailsViewData.Error(null, null, null, null, null, null, null, (String) $r4, 127, null);
        CustomerDetailsViewData $r7 = CustomerDetailsViewData.copy$default((CustomerDetailsViewData) $r6, false, null, $r1, 2, null);
        customerDetailsIssueViewModel.publish($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void disposeLookupProcess() {
        FavoritesArrayAdapter $r1 = this.lookupDisposable;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        CustomerDetailsViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public CustomerDetailsViewData initialData() {
        CustomerDetailsViewData $r1 = new CustomerDetailsViewData(false, null, null, 7, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToIssueResolutionFragment(IssueTypeModel issueTypeModel, Bank bank, String str, boolean z, String str2, String str3, String str4, String str5, String str6) {
        Log_OC.getArray(issueTypeModel, "issueTypeModel");
        Boolean $r9 = issueTypeModel.getShouldSettleCustomer();
        Boolean $r10 = Boolean.FALSE;
        boolean $z1 = Log_OC.append($r9, $r10);
        if ($z1) {
            issueTypeModel.setCustomerBank(null);
            issueTypeModel.setCustomerAccountNumber(null);
        }
        boolean $z12 = anyInvalidInputs(str2, str3, issueTypeModel, str6, str4, str, bank, str5);
        if ($z12) {
            return;
        }
        issueTypeModel.setCustomerName(str2);
        issueTypeModel.setCustomerPhoneNumber(str3);
        String $r11 = bank != null ? bank.getName() : null;
        issueTypeModel.setCustomerBank($r11);
        issueTypeModel.setCustomerAccountNumber(str5);
        issueTypeModel.setTransactionDate(str6);
        issueTypeModel.setAmount(str4);
        if (z) {
            IssueTypeNavigator $r12 = this.issueTypeNavigator;
            $r12.toIssueSummaryFragment(issueTypeModel);
            return;
        }
        IssueTypeNavigator $r122 = this.issueTypeNavigator;
        $r122.toIssueResolutionFragment(issueTypeModel);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public void onCleared() {
        super.onCleared();
        FavoritesArrayAdapter $r1 = this.lookupDisposable;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void performLookup(String str, Bank bank) {
        Log_OC.getArray(str, "accountNo");
        FavoritesArrayAdapter $r3 = this.lookupDisposable;
        if ($r3 != null) {
            $r3.backup();
        }
        boolean $z0 = accountDetailsValid(bank, str);
        if ($z0) {
            ViewData $r4 = getState();
            CustomerDetailsViewData $r5 = (CustomerDetailsViewData) $r4;
            publish(CustomerDetailsViewData.copy$default($r5, true, null, null, 2, null));
            AccountLookup $r6 = this.accountLookup;
            Log_OC.append(bank);
            String $r8 = bank.getBankCode();
            AccountLookupRequest $r7 = new AccountLookupRequest($r8, str);
            AbstractC11688p $r9 = $r6.execute($r7);
            this.lookupDisposable = $r9.e0(new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.OrFilter
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    CustomerDetailsIssueViewModel $r1 = CustomerDetailsIssueViewModel.this;
                    AccountLookupResponse $r32 = (AccountLookupResponse) obj;
                    CustomerDetailsIssueViewModel.m39525performLookup$lambda1($r1, $r32);
                }
            }, new Object() { // from class: ai.kudi.agent.issues.ui.viewModels.Macro
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // p425j.p444e.p450e0.Object
                public final void accept(Object obj) {
                    CustomerDetailsIssueViewModel $r1 = CustomerDetailsIssueViewModel.this;
                    Throwable $r32 = (Throwable) obj;
                    CustomerDetailsIssueViewModel.m39526performLookup$lambda2($r1, $r32);
                }
            });
        }
    }
}
