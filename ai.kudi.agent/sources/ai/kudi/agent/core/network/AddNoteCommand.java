package ai.kudi.agent.core.network;

import ai.kudi.agent.core.usecases.LogUserEventRequest;
import ai.kudi.agent.login.setup.domain.AddDevice;
import ai.kudi.agent.savings.data.model.ResendPinRequest;
import ai.kudi.agent.settings.domain.package_4.AddBankAcctRequest;
import ai.kudi.agent.settings.domain.package_4.ChangePinRequest;
import ai.kudi.agent.settings.domain.package_4.EditProfileRequest;
import ai.kudi.agent.settings.domain.package_4.ResetSavingPinRequest;
import ai.kudi.agent.settings.domain.useCases.UpgradeKycRequest;
import ai.kudi.agent.transactioncommissions.data.CommissionCashoutRequest;
import ai.kudi.agent.transactions.domain.dto.RequestStatementRequest;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.UpdateUser;
import ai.kudi.agent.users.domain.package_1.WithdrawToBankRequest;
import ai.kudi.agent.withdraw_cash.domain.wiki.CardlessWithdrawalApiCommData;
import ai.kudi.agent.withdrawal.domain.wiki.WithdrawalRequest;
import java.util.Map;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: Api.kt */
@Metadata(m10422d1 = {"\u0000ú\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\rH'J(\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0011\u001a\u00020\tH'J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0013\u001a\u00020\tH'J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020\u0016H'J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0019\u001a\u00020\u001aH'J$\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J4\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\u0014\b\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0!H'J\u001e\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J:\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001c0\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\u0014\b\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0!H'J\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J\u001e\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J \u0010*\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001c0\u000f0\u00040\u0003H'J$\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u001c0\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J:\u0010.\u001a*\u0012&\u0012$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002000/j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u000200`10\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J\u001e\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u001c0\u00032\b\b\u0001\u00104\u001a\u00020\tH'J\u0014\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u000f0\u0003H'J$\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u001c0\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J\u001e\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J$\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u000f0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'JB\u0010>\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u001c0\u000f0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\u0016\b\u0001\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0!H'J\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J\u001a\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u001c0\u000f0\u0003H'J8\u0010D\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0/j\u0002`E0\u000f0\u00032\b\b\u0001\u0010F\u001a\u00020\t2\b\b\u0001\u0010G\u001a\u00020\tH'J<\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u001c0\u000f0\u00032\b\b\u0001\u0010F\u001a\u00020\t2\u0016\b\u0001\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0!H'JL\u0010J\u001a$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0/j\u0002`K0\u001c0\u000f0\u00032\b\b\u0001\u0010F\u001a\u00020\t2\u0016\b\u0001\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0!H'J\u0018\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J<\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0\u001c0\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\u0016\b\u0001\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0!H'J>\u0010P\u001a.\u0012*\u0012(\u0012$\u0012\"\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0/j\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t`10\u000f0\u00032\b\b\u0001\u0010\u0015\u001a\u00020QH'J\"\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020TH'J.\u0010U\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\u000f0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010W\u001a\u00020\tH'J\"\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020ZH'J\"\u0010[\u001a\b\u0012\u0004\u0012\u00020S0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020TH'J,\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\u00032\b\b\u0001\u0010^\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020_H'J(\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0\u000f0\u00032\b\b\u0001\u0010\u0015\u001a\u00020b2\b\b\u0001\u0010F\u001a\u00020\tH'J\u0018\u0010c\u001a\b\u0012\u0004\u0012\u00020d0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010e\u001a\u00020gH'J\"\u0010h\u001a\b\u0012\u0004\u0012\u00020i0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020jH'J(\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020mH'J<\u0010n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0\u001c0\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\u0016\b\u0001\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0!H'J0\u0010p\u001a\b\u0012\u0004\u0012\u00020q0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\u0016\b\u0001\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0!H'J.\u0010r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020s0\u000f0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020tH'J\"\u0010u\u001a\b\u0012\u0004\u0012\u00020'0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010v\u001a\u00020wH'J,\u0010x\u001a\b\u0012\u0004\u0012\u00020S0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010G\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020TH'J\"\u0010y\u001a\b\u0012\u0004\u0012\u00020z0\u00032\b\b\u0001\u0010{\u001a\u00020|2\b\b\u0001\u0010\b\u001a\u00020\tH'J(\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020~0\u000f0\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020\u0016H'¨\u0006\u007f"}, m10421d2 = {"Lai/kudi/agent/core/network/Api;", "", "addBankAcct", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Lai/kudi/agent/settings/domain/dto/AddBankAcctResponse;", "addBankAcctRequest", "Lai/kudi/agent/settings/domain/dto/AddBankAcctRequest;", "sessionId", "", "changePin", "Lai/kudi/agent/settings/domain/dto/ChangePinResponse;", "changePinRequest", "Lai/kudi/agent/settings/domain/dto/ChangePinRequest;", "commissionCashoutSummary", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/transactions/domain/dto/WalletSummary;", "walletId", "deleteDevice", "id", "doWithdrawal", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/withdraw_cash/domain/dto/CardlessWithdrawalApiCommData$Request;", "editUserProfile", "Lai/kudi/agent/settings/domain/dto/EditProfileResponse;", "editProfileRequest", "Lai/kudi/agent/settings/domain/dto/EditProfileRequest;", "fetchCurrentUserAcct", "", "Lai/kudi/agent/core/domain/room_entities/BankAccount;", "fetchDashboardSummary", "Lai/kudi/agent/dashboard/domain/dto/DashboardSummaryDto;", "query", "", "fetchRelationshipManager", "Lai/kudi/agent/core/domain/room_entities/RelationshipManager;", "fetchTransactionBreakDownSummary", "Lai/kudi/agent/dashboard/domain/model/TransactionBreakDownDomain;", "fetchUser", "Lai/kudi/agent/users/domain/dto/User;", "getAllWallets", "Lai/kudi/agent/transactions/domain/dto/AllWallets;", "getBanks", "Lai/kudi/agent/wallettopup/data/BanksWithMethods;", "getDevices", "Lai/kudi/agent/settings/domain/dto/MyDevice;", "getFrequentlyUsedBills", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getKCashInstructions", "Lai/kudi/agent/users/domain/dto/KCashInstruction;", TransactionField.AMOUNT, "getKycLevels", "Lai/kudi/agent/settings/domain/dto/KycLevelResponse;", "getMiniMonnifyDetails", "Lai/kudi/agent/wallettopup/data/MiniMonnifyDetails;", "getMonnifyDetails", "Lai/kudi/agent/wallettopup/data/MonnifyDetails;", "getMonthlyKycLevels", "getNotificationCount", "Lai/kudi/agent/notification/viewmodels/NotificationCount;", "getNotifications", "Lai/kudi/agent/notification/data/model/NotificationModel;", "getPaymentMethods", "Lai/kudi/agent/payments/domain/dto/SessionPaymentMethod;", "getSupportPhoneNumbers", "Lai/kudi/agent/help/data/SupportInfoModel;", "getTransaction", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "userId", "reference", "getUserIncompleteTransactions", "Lai/kudi/agent/transactionhistory/data/model/IncompleteTransaction;", "getUserTransactions", "Lai/kudi/agent/transactions/domain/dto/ReceiptTransaction;", "getWallet", "Lai/kudi/agent/users/domain/dto/Wallet;", "getWalletActivities", "Lai/kudi/agent/users/data/model/WalletActivityModel;", "logUserEvent", "Lai/kudi/agent/core/usecases/LogUserEventRequest;", "logWithdrawalRequest", "Lai/kudi/agent/withdrawal/domain/dto/WithdrawalResponse;", "Lai/kudi/agent/withdrawal/domain/dto/WithdrawalRequest;", "lookUpUser", "Lai/kudi/agent/users/data/model/LookUpUserRequest;", "handleOrPhone", "postTransaction", "Lai/kudi/agent/kshock/data/domain/dto/TransactionResponse;", "Lai/kudi/agent/transactions/domain/dto/TransactionRequest;", "postWithdrawal", "postWithdrawalToBank", "Lai/kudi/agent/users/domain/dto/WithdrawToBankResponse;", "deviceId", "Lai/kudi/agent/users/domain/dto/WithdrawToBankRequest;", "requestCommissionsCashout", "Lai/kudi/agent/transactioncommissions/data/CommissionCashoutResponse;", "Lai/kudi/agent/transactioncommissions/data/CommissionCashoutRequest;", "requestSavingPinOtp", "Lai/kudi/agent/settings/domain/dto/RequestPinResetOtpResponse;", "requestStatement", "Lai/kudi/agent/transactions/domain/dto/RequestStatementResponse;", "Lai/kudi/agent/transactions/domain/dto/RequestStatementRequest;", "resendOtp", "Lai/kudi/agent/savings/data/model/RequestPinResetOtpResponse;", "Lai/kudi/agent/savings/data/model/ResendPinRequest;", "resetSavingsPin", "Lai/kudi/agent/settings/domain/dto/ResetSavingPinResponse;", "Lai/kudi/agent/settings/domain/dto/ResetSavingPinRequest;", "searchWalletActivities", "Lai/kudi/agent/users/data/model/SearchWalletActivityModel;", "sendTransactionToMail", "Lai/kudi/agent/transactions/domain/usecases/SendTransactionResponse;", "updateDeviceInfo", "Lai/kudi/agent/users/domain/dto/UpdateSourceInfoResponse;", "Lai/kudi/agent/login/setup/domain/AddDevice$Input;", "updateUserProfile", "updateUser", "Lai/kudi/agent/users/domain/dto/UpdateUser;", "updateWithdrawal", "upgradeUserkyc", "Lai/kudi/agent/settings/domain/useCases/UpgradeKycResponse;", "upgradeKycRequest", "Lai/kudi/agent/settings/domain/useCases/UpgradeKycRequest;", "validateVoucherCode", "Lai/kudi/agent/withdraw_cash/domain/dto/CardlessWithdrawalApiCommData$Response;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface AddNoteCommand {
    AbstractC11688p addBankAcct(AddBankAcctRequest addBankAcctRequest, String str);

    AbstractC11688p changePin(String str, ChangePinRequest changePinRequest);

    AbstractC11688p commissionCashoutSummary(String str, String str2);

    AbstractC11688p deleteDevice(String str, String str2);

    AbstractC11688p doWithdrawal(String str, CardlessWithdrawalApiCommData.Request request);

    AbstractC11688p editUserProfile(String str, EditProfileRequest editProfileRequest);

    AbstractC11688p fetchCurrentUserAcct(String str);

    AbstractC11688p fetchDashboardSummary(String str, Map map);

    AbstractC11688p fetchRelationshipManager(String str);

    AbstractC11688p fetchTransactionBreakDownSummary(String str, Map map);

    AbstractC11688p fetchUser(String str);

    AbstractC11688p getAllWallets(String str);

    AbstractC11688p getBanks();

    AbstractC11688p getDevices(String str);

    AbstractC11688p getFrequentlyUsedBills(String str);

    AbstractC11688p getKCashInstructions(String str);

    AbstractC11688p getKycLevels();

    AbstractC11688p getMiniMonnifyDetails(String str);

    AbstractC11688p getMonnifyDetails(String str);

    AbstractC11688p getMonthlyKycLevels(String str);

    AbstractC11688p getNotificationCount(String str);

    AbstractC11688p getNotifications(String str, Map map);

    AbstractC11688p getPaymentMethods(String str);

    AbstractC11688p getSupportPhoneNumbers();

    AbstractC11688p getTransaction(String str, String str2);

    AbstractC11688p getUserIncompleteTransactions(String str, Map map);

    AbstractC11688p getUserTransactions(String str, Map map);

    AbstractC11688p getWallet(String str);

    AbstractC11688p getWalletActivities(String str, Map map);

    AbstractC11688p logUserEvent(LogUserEventRequest logUserEventRequest);

    AbstractC11688p logWithdrawalRequest(String str, WithdrawalRequest withdrawalRequest);

    AbstractC11688p lookUpUser(String str, String str2);

    AbstractC11688p postTransaction(String str, TransactionRequest transactionRequest);

    AbstractC11688p postWithdrawal(String str, WithdrawalRequest withdrawalRequest);

    AbstractC11688p postWithdrawalToBank(String str, String str2, WithdrawToBankRequest withdrawToBankRequest);

    AbstractC11688p requestCommissionsCashout(CommissionCashoutRequest commissionCashoutRequest, String str);

    AbstractC11688p requestSavingPinOtp(String str);

    AbstractC11688p requestStatement(String str, RequestStatementRequest requestStatementRequest);

    AbstractC11688p resendOtp(String str, ResendPinRequest resendPinRequest);

    AbstractC11688p resetSavingsPin(String str, ResetSavingPinRequest resetSavingPinRequest);

    AbstractC11688p searchWalletActivities(String str, Map map);

    AbstractC11688p sendTransactionToMail(String str, Map map);

    AbstractC11688p updateDeviceInfo(String str, AddDevice.Input input);

    AbstractC11688p updateUserProfile(String str, UpdateUser updateUser);

    AbstractC11688p updateWithdrawal(String str, String str2, WithdrawalRequest withdrawalRequest);

    AbstractC11688p upgradeUserkyc(UpgradeKycRequest upgradeKycRequest, String str);

    AbstractC11688p validateVoucherCode(String str, CardlessWithdrawalApiCommData.Request request);
}
