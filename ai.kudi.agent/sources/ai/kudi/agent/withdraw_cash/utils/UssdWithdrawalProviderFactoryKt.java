package ai.kudi.agent.withdraw_cash.utils;

import ai.kudi.agent.bills.data.BillerKt;
import ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.p557z.C13726r;
/* compiled from: UssdWithdrawalProviderFactory.kt */
@Metadata(m10422d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m10421d2 = {"localUssdWithdrawalProvider", "", "Lai/kudi/agent/core/domain/room_entities/UssdWithdrawalProvider;", "getLocalUssdWithdrawalProvider", "()Ljava/util/List;", "app_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UssdWithdrawalProviderFactoryKt {
    private static final List<UssdWithdrawalProvider> localUssdWithdrawalProvider;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        List $r0;
        UssdWithdrawalProvider $r2 = new UssdWithdrawalProvider("CORAL_PAYCODE", "Access (Diamond)", "063", true, "CORAL_PAY", "Kindly inform your customer to dial the code below to complete this transaction from the phone number registered to their bank.", "*901*000*refcode#");
        UssdWithdrawalProvider $r22 = new UssdWithdrawalProvider("CORAL_PAYCODE", "Ecobank", "050", true, "CORAL_PAY", "Kindly inform your customer to dial the code below to complete this transaction from the phone number registered to their bank.", "*326*000*refcode#");
        UssdWithdrawalProvider $r23 = new UssdWithdrawalProvider("CORAL_PAYCODE", "Fidelity", "070", true, "CORAL_PAY", "Kindly inform your customer to dial the code below to complete this transaction from the phone number registered to their bank.", "*770*000*refcode#");
        UssdWithdrawalProvider $r24 = new UssdWithdrawalProvider("CORAL_PAYCODE", "First Bank", "011", true, "CORAL_PAY", "Kindly inform your customer to dial the code below to complete this transaction from the phone number registered to their bank.", "*894*89414197*amount#");
        UssdWithdrawalProvider $r25 = new UssdWithdrawalProvider("CORAL_PAYCODE", "GTB", "058", true, "CORAL_PAY", "Kindly inform your customer to dial the code below to complete this transaction from the phone number registered to their bank.", "*737*000*refcode#");
        UssdWithdrawalProvider $r26 = new UssdWithdrawalProvider("CORAL_PAYCODE", "Keystone", "082", true, "CORAL_PAY", "Kindly inform your customer to dial the code below to complete this transaction from the phone number registered to their bank.", "*7111*000*refcode#");
        UssdWithdrawalProvider $r27 = new UssdWithdrawalProvider("KUDI_CARDLESS", "Kudi Save", UssdWithdrawalUtilKt.USSD_PROVIDER_KUDI_SAVE, true, "KUDI_SAVE", "Request voucher code from the agent.", BillerKt.NAMEPROMPT_NA);
        UssdWithdrawalProvider $r28 = new UssdWithdrawalProvider("CORAL_PAYCODE", "Rubies MFB", BillerKt.NAMEPROMPT_NA, true, "CORAL_PAY", "CORAL_PAY", "*7797*000*refcode#");
        UssdWithdrawalProvider $r29 = new UssdWithdrawalProvider("CORAL_PAYCODE", "Stanbic", "039", true, "CORAL_PAY", "Kindly inform your customer to dial the code below to complete this transaction from the phone number registered to their bank.", "*909*000*refcode#");
        UssdWithdrawalProvider $r210 = new UssdWithdrawalProvider("CORAL_PAYCODE", "Sterling", "232", true, "CORAL_PAY", "Kindly inform your customer to dial the code below to complete this transaction from the phone number registered to their bank.", "*822*000*refcode#");
        UssdWithdrawalProvider $r211 = new UssdWithdrawalProvider("CORAL_PAYCODE", "UBA", "033", true, "CORAL_PAY", "Kindly inform your customer to dial the code below to complete this transaction from the phone number registered to their bank.", "*919*000*refcode#");
        UssdWithdrawalProvider $r212 = new UssdWithdrawalProvider("CORAL_PAYCODE", "Unity", "215", true, "CORAL_PAY", "Kindly inform your customer to dial the code below to complete this transaction from the phone number registered to their bank.", "*7799*000*refcode#");
        UssdWithdrawalProvider $r213 = new UssdWithdrawalProvider("CORAL_PAYCODE", "Wema", "035", true, "CORAL_PAY", "Kindly inform your customer to dial the code below to complete this transaction from the phone number registered to their bank.", "*945*000*refcode#");
        UssdWithdrawalProvider $r214 = new UssdWithdrawalProvider("CORAL_PAYCODE", "Zenith", "057", true, "CORAL_PAY", "Kindly inform your customer to dial the code below to complete this transaction from the phone number registered to their bank.", "*966*000*refcode#");
        UssdWithdrawalProvider[] $r1 = {$r2, $r22, $r23, $r24, $r25, $r26, $r27, $r28, $r29, $r210, $r211, $r212, $r213, $r214};
        $r0 = C13726r.m3888h($r1);
        localUssdWithdrawalProvider = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final List getLocalUssdWithdrawalProvider() {
        List r0 = localUssdWithdrawalProvider;
        return r0;
    }
}
