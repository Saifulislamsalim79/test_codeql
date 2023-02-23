package ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal;

import ai.kudi.agent.core.mvvm.ViewData;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: UssdWithdrawalVoucherInputViewData.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u00ad\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u0010>\u001a\u00020\u00032\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\bHÖ\u0001J\t\u0010B\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006C"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/UssdWithdrawalVoucherInputViewData;", "Lai/kudi/agent/core/mvvm/ViewData;", "showScreenLoader", "", "toastMsg", "", "errorMsg", "errorViewId", "", "providerName", "promptText", "showWarning", "showOtherViews", "showPromptText", "showVoucherInput", "screenStateId", "openBankSelector", "openVoucherScreen", "openAmountInputScreen", "voucherData", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/VoucherData;", "voucherlessPayload", "Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/NoVoucherWithdrawalPayload;", "(ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZZZIZZZLai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/VoucherData;Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/NoVoucherWithdrawalPayload;)V", "getErrorMsg", "()Ljava/lang/String;", "getErrorViewId", "()I", "getOpenAmountInputScreen", "()Z", "getOpenBankSelector", "getOpenVoucherScreen", "getPromptText", "getProviderName", "getScreenStateId", "getShowOtherViews", "getShowPromptText", "getShowScreenLoader", "getShowVoucherInput", "getShowWarning", "getToastMsg", "getVoucherData", "()Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/VoucherData;", "getVoucherlessPayload", "()Lai/kudi/agent/withdraw_cash/ui/viewdata/withdrawal_option/ussd_withdrawal/NoVoucherWithdrawalPayload;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputViewData */
/* loaded from: classes.dex */
public final class UssdWithdrawalVoucherInputViewData implements ViewData {
    private final String errorMsg;
    private final int errorViewId;
    private final boolean openAmountInputScreen;
    private final boolean openBankSelector;
    private final boolean openVoucherScreen;
    private final String promptText;
    private final String providerName;
    private final int screenStateId;
    private final boolean showOtherViews;
    private final boolean showPromptText;
    private final boolean showScreenLoader;
    private final boolean showVoucherInput;
    private final boolean showWarning;
    private final String toastMsg;
    private final VoucherData voucherData;
    private final NoVoucherWithdrawalPayload voucherlessPayload;

    public UssdWithdrawalVoucherInputViewData() {
        this(false, null, null, 0, null, null, false, false, false, false, 0, false, false, false, null, null, 65535, null);
    }

    public UssdWithdrawalVoucherInputViewData(boolean z, String str, String str2, int i, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6, boolean z7, boolean z8, VoucherData voucherData, NoVoucherWithdrawalPayload noVoucherWithdrawalPayload) {
        Log_OC.getArray(str, "toastMsg");
        Log_OC.getArray(str2, "errorMsg");
        Log_OC.getArray(str3, "providerName");
        Log_OC.getArray(str4, "promptText");
        this.showScreenLoader = z;
        this.toastMsg = str;
        this.errorMsg = str2;
        this.errorViewId = i;
        this.providerName = str3;
        this.promptText = str4;
        this.showWarning = z2;
        this.showOtherViews = z3;
        this.showPromptText = z4;
        this.showVoucherInput = z5;
        this.screenStateId = i2;
        this.openBankSelector = z6;
        this.openVoucherScreen = z7;
        this.openAmountInputScreen = z8;
        this.voucherData = voucherData;
        this.voucherlessPayload = noVoucherWithdrawalPayload;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UssdWithdrawalVoucherInputViewData(boolean r23, java.lang.String r24, java.lang.String r25, int r26, java.lang.String r27, java.lang.String r28, boolean r29, boolean r30, boolean r31, boolean r32, int r33, boolean r34, boolean r35, boolean r36, ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.VoucherData r37, ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.NoVoucherWithdrawalPayload r38, int r39, kotlin.p483e0.p485d.DBUtils$1 r40) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.withdraw_cash.p040ui.viewdata.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputViewData.<init>(boolean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, int, boolean, boolean, boolean, ai.kudi.agent.withdraw_cash.ui.viewdata.withdrawal_option.ussd_withdrawal.VoucherData, ai.kudi.agent.withdraw_cash.ui.viewdata.withdrawal_option.ussd_withdrawal.NoVoucherWithdrawalPayload, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ UssdWithdrawalVoucherInputViewData copy$default(UssdWithdrawalVoucherInputViewData ussdWithdrawalVoucherInputViewData, boolean $z0, String $r2, String $r3, int $i1, String $r4, String $r5, boolean $z1, boolean $z2, boolean $z3, boolean $z4, int $i2, boolean $z5, boolean $z6, boolean $z7, VoucherData $r6, NoVoucherWithdrawalPayload $r7, int $i3, Object obj) {
        if (($i3 & 1) != 0) {
            $z0 = ussdWithdrawalVoucherInputViewData.showScreenLoader;
        }
        if (($i3 & 2) != 0) {
            $r2 = ussdWithdrawalVoucherInputViewData.toastMsg;
        }
        if (($i3 & 4) != 0) {
            $r3 = ussdWithdrawalVoucherInputViewData.errorMsg;
        }
        if (($i3 & 8) != 0) {
            $i1 = ussdWithdrawalVoucherInputViewData.errorViewId;
        }
        if (($i3 & 16) != 0) {
            $r4 = ussdWithdrawalVoucherInputViewData.providerName;
        }
        if (($i3 & 32) != 0) {
            $r5 = ussdWithdrawalVoucherInputViewData.promptText;
        }
        if (($i3 & 64) != 0) {
            $z1 = ussdWithdrawalVoucherInputViewData.showWarning;
        }
        if (($i3 & 128) != 0) {
            $z2 = ussdWithdrawalVoucherInputViewData.showOtherViews;
        }
        if (($i3 & 256) != 0) {
            $z3 = ussdWithdrawalVoucherInputViewData.showPromptText;
        }
        if (($i3 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0) {
            $z4 = ussdWithdrawalVoucherInputViewData.showVoucherInput;
        }
        if (($i3 & 1024) != 0) {
            $i2 = ussdWithdrawalVoucherInputViewData.screenStateId;
        }
        if (($i3 & IjkMediaMeta.FF_PROFILE_H264_INTRA) != 0) {
            $z5 = ussdWithdrawalVoucherInputViewData.openBankSelector;
        }
        if (($i3 & 4096) != 0) {
            boolean $z62 = ussdWithdrawalVoucherInputViewData.openVoucherScreen;
            $z6 = $z62;
        }
        if (($i3 & 8192) != 0) {
            boolean $z72 = ussdWithdrawalVoucherInputViewData.openAmountInputScreen;
            $z7 = $z72;
        }
        if (($i3 & 16384) != 0) {
            VoucherData $r62 = ussdWithdrawalVoucherInputViewData.voucherData;
            $r6 = $r62;
        }
        int $i0 = $i3 & 32768;
        if ($i0 != 0) {
            NoVoucherWithdrawalPayload $r72 = ussdWithdrawalVoucherInputViewData.voucherlessPayload;
            $r7 = $r72;
        }
        UssdWithdrawalVoucherInputViewData $r0 = ussdWithdrawalVoucherInputViewData.copy($z0, $r2, $r3, $i1, $r4, $r5, $z1, $z2, $z3, $z4, $i2, $z5, $z6, $z7, $r6, $r7);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component1() {
        boolean z0 = this.showScreenLoader;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component10() {
        boolean z0 = this.showVoucherInput;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int component11() {
        int i0 = this.screenStateId;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component12() {
        boolean z0 = this.openBankSelector;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component13() {
        boolean z0 = this.openVoucherScreen;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component14() {
        boolean z0 = this.openAmountInputScreen;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final VoucherData component15() {
        VoucherData r1 = this.voucherData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NoVoucherWithdrawalPayload component16() {
        NoVoucherWithdrawalPayload r1 = this.voucherlessPayload;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component2() {
        String r1 = this.toastMsg;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component3() {
        String r1 = this.errorMsg;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int component4() {
        int i0 = this.errorViewId;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component5() {
        String r1 = this.providerName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component6() {
        String r1 = this.promptText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component7() {
        boolean z0 = this.showWarning;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component8() {
        boolean z0 = this.showOtherViews;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component9() {
        boolean z0 = this.showPromptText;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UssdWithdrawalVoucherInputViewData copy(boolean z, String str, String str2, int i, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6, boolean z7, boolean z8, VoucherData voucherData, NoVoucherWithdrawalPayload noVoucherWithdrawalPayload) {
        Log_OC.getArray(str, "toastMsg");
        Log_OC.getArray(str2, "errorMsg");
        Log_OC.getArray(str3, "providerName");
        Log_OC.getArray(str4, "promptText");
        UssdWithdrawalVoucherInputViewData $r0 = new UssdWithdrawalVoucherInputViewData(z, str, str2, i, str3, str4, z2, z3, z4, z5, i2, z6, z7, z8, voucherData, noVoucherWithdrawalPayload);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof UssdWithdrawalVoucherInputViewData;
        if ($z0) {
            UssdWithdrawalVoucherInputViewData $r2 = (UssdWithdrawalVoucherInputViewData) obj;
            boolean $z02 = this.showScreenLoader;
            boolean $z1 = $r2.showScreenLoader;
            if ($z02 != $z1) {
                return false;
            }
            String $r3 = this.toastMsg;
            String $r4 = $r2.toastMsg;
            boolean $z03 = Log_OC.append($r3, $r4);
            if ($z03) {
                String $r32 = this.errorMsg;
                String $r42 = $r2.errorMsg;
                boolean $z04 = Log_OC.append($r32, $r42);
                if ($z04) {
                    int $i0 = this.errorViewId;
                    int $i1 = $r2.errorViewId;
                    if ($i0 != $i1) {
                        return false;
                    }
                    String $r33 = this.providerName;
                    String $r43 = $r2.providerName;
                    boolean $z05 = Log_OC.append($r33, $r43);
                    if ($z05) {
                        String $r34 = this.promptText;
                        String $r44 = $r2.promptText;
                        boolean $z06 = Log_OC.append($r34, $r44);
                        if ($z06) {
                            boolean $z07 = this.showWarning;
                            boolean $z12 = $r2.showWarning;
                            if ($z07 != $z12) {
                                return false;
                            }
                            boolean $z08 = this.showOtherViews;
                            boolean $z13 = $r2.showOtherViews;
                            if ($z08 != $z13) {
                                return false;
                            }
                            boolean $z09 = this.showPromptText;
                            boolean $z14 = $r2.showPromptText;
                            if ($z09 != $z14) {
                                return false;
                            }
                            boolean $z010 = this.showVoucherInput;
                            boolean $z15 = $r2.showVoucherInput;
                            if ($z010 != $z15) {
                                return false;
                            }
                            int $i02 = this.screenStateId;
                            int $i12 = $r2.screenStateId;
                            if ($i02 != $i12) {
                                return false;
                            }
                            boolean $z011 = this.openBankSelector;
                            boolean $z16 = $r2.openBankSelector;
                            if ($z011 != $z16) {
                                return false;
                            }
                            boolean $z012 = this.openVoucherScreen;
                            boolean $z17 = $r2.openVoucherScreen;
                            if ($z012 != $z17) {
                                return false;
                            }
                            boolean $z013 = this.openAmountInputScreen;
                            boolean $z18 = $r2.openAmountInputScreen;
                            if ($z013 != $z18) {
                                return false;
                            }
                            VoucherData $r5 = this.voucherData;
                            VoucherData $r6 = $r2.voucherData;
                            boolean $z014 = Log_OC.append($r5, $r6);
                            if ($z014) {
                                NoVoucherWithdrawalPayload $r7 = this.voucherlessPayload;
                                NoVoucherWithdrawalPayload $r8 = $r2.voucherlessPayload;
                                boolean $z015 = Log_OC.append($r7, $r8);
                                return $z015;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
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
    public final String getErrorMsg() {
        String r1 = this.errorMsg;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getErrorViewId() {
        int i0 = this.errorViewId;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getOpenAmountInputScreen() {
        boolean z0 = this.openAmountInputScreen;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getOpenBankSelector() {
        boolean z0 = this.openBankSelector;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getOpenVoucherScreen() {
        boolean z0 = this.openVoucherScreen;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPromptText() {
        String r1 = this.promptText;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getProviderName() {
        String r1 = this.providerName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getScreenStateId() {
        int i0 = this.screenStateId;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getShowOtherViews() {
        boolean z0 = this.showOtherViews;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getShowPromptText() {
        boolean z0 = this.showPromptText;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getShowScreenLoader() {
        boolean z0 = this.showScreenLoader;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getShowVoucherInput() {
        boolean z0 = this.showVoucherInput;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getShowWarning() {
        boolean z0 = this.showWarning;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getToastMsg() {
        String r1 = this.toastMsg;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final VoucherData getVoucherData() {
        VoucherData r1 = this.voucherData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NoVoucherWithdrawalPayload getVoucherlessPayload() {
        NoVoucherWithdrawalPayload r1 = this.voucherlessPayload;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean $z0 = this.showScreenLoader;
        if ($z0) {
            $z0 = true;
        }
        int $i0 = $z0 ? 1 : 0;
        String $r1 = this.toastMsg;
        int $i1 = $r1.hashCode();
        String $r12 = this.errorMsg;
        int $i12 = $r12.hashCode();
        int $i13 = this.errorViewId;
        String $r13 = this.providerName;
        int $i14 = $r13.hashCode();
        String $r14 = this.promptText;
        int $i15 = $r14.hashCode();
        int $i02 = (((((((((($i0 * 31) + $i1) * 31) + $i12) * 31) + $i13) * 31) + $i14) * 31) + $i15) * 31;
        boolean $z02 = this.showWarning;
        int i = $z02;
        if ($z02 != 0) {
            i = 1;
        }
        int $i16 = i;
        int $i03 = ($i02 + $i16) * 31;
        boolean $z03 = this.showOtherViews;
        int i2 = $z03;
        if ($z03 != 0) {
            i2 = 1;
        }
        int $i17 = i2;
        int $i04 = ($i03 + $i17) * 31;
        boolean $z04 = this.showPromptText;
        int i3 = $z04;
        if ($z04 != 0) {
            i3 = 1;
        }
        int $i18 = i3;
        int $i05 = ($i04 + $i18) * 31;
        boolean $z05 = this.showVoucherInput;
        int i4 = $z05;
        if ($z05 != 0) {
            i4 = 1;
        }
        int $i19 = i4;
        int $i110 = this.screenStateId;
        int $i06 = ((($i05 + $i19) * 31) + $i110) * 31;
        boolean $z06 = this.openBankSelector;
        int i5 = $z06;
        if ($z06 != 0) {
            i5 = 1;
        }
        int $i111 = i5;
        int $i07 = ($i06 + $i111) * 31;
        boolean $z07 = this.openVoucherScreen;
        int i6 = $z07;
        if ($z07 != 0) {
            i6 = 1;
        }
        int $i112 = i6;
        int $i08 = ($i07 + $i112) * 31;
        boolean $z08 = this.openAmountInputScreen;
        int $i113 = $z08 ? 1 : $z08 ? 1 : 0;
        int $i114 = ($i08 + $i113) * 31;
        VoucherData $r2 = this.voucherData;
        int $i2 = $r2 == null ? 0 : $r2.hashCode();
        int $i115 = ($i114 + $i2) * 31;
        NoVoucherWithdrawalPayload $r3 = this.voucherlessPayload;
        int $i09 = $r3 != null ? $r3.hashCode() : 0;
        return $i115 + $i09;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("UssdWithdrawalVoucherInputViewData(showScreenLoader=");
        boolean $z0 = this.showScreenLoader;
        $r2.append($z0);
        $r2.append(", toastMsg=");
        String $r1 = this.toastMsg;
        $r2.append($r1);
        $r2.append(", errorMsg=");
        String $r12 = this.errorMsg;
        $r2.append($r12);
        $r2.append(", errorViewId=");
        int $i0 = this.errorViewId;
        $r2.append($i0);
        $r2.append(", providerName=");
        String $r13 = this.providerName;
        $r2.append($r13);
        $r2.append(", promptText=");
        String $r14 = this.promptText;
        $r2.append($r14);
        $r2.append(", showWarning=");
        boolean $z02 = this.showWarning;
        $r2.append($z02);
        $r2.append(", showOtherViews=");
        boolean $z03 = this.showOtherViews;
        $r2.append($z03);
        $r2.append(", showPromptText=");
        boolean $z04 = this.showPromptText;
        $r2.append($z04);
        $r2.append(", showVoucherInput=");
        boolean $z05 = this.showVoucherInput;
        $r2.append($z05);
        $r2.append(", screenStateId=");
        int $i02 = this.screenStateId;
        $r2.append($i02);
        $r2.append(", openBankSelector=");
        boolean $z06 = this.openBankSelector;
        $r2.append($z06);
        $r2.append(", openVoucherScreen=");
        boolean $z07 = this.openVoucherScreen;
        $r2.append($z07);
        $r2.append(", openAmountInputScreen=");
        boolean $z08 = this.openAmountInputScreen;
        $r2.append($z08);
        $r2.append(", voucherData=");
        VoucherData $r3 = this.voucherData;
        $r2.append($r3);
        $r2.append(", voucherlessPayload=");
        NoVoucherWithdrawalPayload $r4 = this.voucherlessPayload;
        $r2.append($r4);
        $r2.append(')');
        String $r15 = $r2.toString();
        return $r15;
    }
}
