package ai.kudi.agent.register.data.models;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.register.domain.wiki.AccountType;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* compiled from: AccountTypeUiInfo.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/register/data/models/AccountTypeUiInfo;", "", "descriptionText", "", "accountTypePossibilities", "", "whatYouCanDoHeader", "bottomText", "(ILjava/util/List;II)V", "getAccountTypePossibilities", "()Ljava/util/List;", "getBottomText", "()I", "getDescriptionText", "getWhatYouCanDoHeader", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AccountTypeUiInfo {
    public static final Companion Companion;
    private final List<Integer> accountTypePossibilities;
    private final int bottomText;
    private final int descriptionText;
    private final int whatYouCanDoHeader;

    /* compiled from: AccountTypeUiInfo.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/register/data/models/AccountTypeUiInfo$Companion;", "", "()V", "getAccountTypeInfo", "Lai/kudi/agent/register/data/models/AccountTypeUiInfo;", "accountType", "Lai/kudi/agent/register/domain/dto/AccountType;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {

        /* compiled from: AccountTypeUiInfo.kt */
        @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            static {
                AccountType[] $r0 = AccountType.values();
                int $i0 = $r0.length;
                int[] $r1 = new int[$i0];
                AccountType $r2 = AccountType.AGENT;
                int $i02 = $r2.ordinal();
                $r1[$i02] = 1;
                AccountType $r22 = AccountType.MERCHANT;
                int $i03 = $r22.ordinal();
                $r1[$i03] = 2;
                AccountType $r23 = AccountType.MERCHANT_AGENT;
                int $i04 = $r23.ordinal();
                $r1[$i04] = 3;
                $EnumSwitchMapping$0 = $r1;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final AccountTypeUiInfo getAccountTypeInfo(AccountType accountType) {
            List $r6;
            List $r62;
            List $r63;
            Log_OC.getArray(accountType, "accountType");
            int[] $r2 = WhenMappings.$EnumSwitchMapping$0;
            int $i0 = $r2[accountType.ordinal()];
            if ($i0 == 1) {
                Integer $r5 = Integer.valueOf((int) C0001R.string.agent_can_do_widthrawals_text);
                Integer $r52 = Integer.valueOf((int) C0001R.string.access_to_loans);
                Integer[] $r4 = {$r5, $r52};
                $r6 = C13726r.m3888h($r4);
                AccountTypeUiInfo $r3 = new AccountTypeUiInfo(C0001R.string.agent_type_description_text, $r6, C0001R.string.what_you_can_do_as_agent, C0001R.string.agent_type_bottom_text);
                return $r3;
            } else if ($i0 == 2) {
                Integer $r53 = Integer.valueOf((int) C0001R.string.merchant_collect_payment_text);
                Integer $r54 = Integer.valueOf((int) C0001R.string.access_business_tools_merchant);
                Integer $r55 = Integer.valueOf((int) C0001R.string.we_will_create_business_acct_merchant_text);
                Integer[] $r42 = {$r53, $r54, $r55};
                $r62 = C13726r.m3888h($r42);
                AccountTypeUiInfo $r32 = new AccountTypeUiInfo(C0001R.string.merchant_description_promo_text, $r62, C0001R.string.what_you_can_do_as_a_merchant, C0001R.string.dont_want_to_be_a_merchant_text);
                return $r32;
            } else if ($i0 != 3) {
                return null;
            } else {
                Integer $r56 = Integer.valueOf((int) C0001R.string.merchant_can_sell_things);
                Integer $r57 = Integer.valueOf((int) C0001R.string.merchant_agent_can_do_agent);
                Integer $r58 = Integer.valueOf((int) C0001R.string.we_will_create_business_acct_merchant_text);
                Integer[] $r43 = {$r56, $r57, $r58};
                $r63 = C13726r.m3888h($r43);
                AccountTypeUiInfo $r33 = new AccountTypeUiInfo(C0001R.string.merchant_agent_description_text, $r63, C0001R.string.mechant_agent_can_dos, C0001R.string.merchant_agent_bottom_view);
                return $r33;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public AccountTypeUiInfo(int i, List list, int i2, int i3) {
        Log_OC.getArray(list, "accountTypePossibilities");
        this.descriptionText = i;
        this.accountTypePossibilities = list;
        this.whatYouCanDoHeader = i2;
        this.bottomText = i3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ AccountTypeUiInfo copy$default(AccountTypeUiInfo accountTypeUiInfo, int $i0, List $r1, int $i1, int $i2, int i, Object obj) {
        int $i4 = i & 1;
        if ($i4 != 0) {
            $i0 = accountTypeUiInfo.descriptionText;
        }
        int $i42 = i & 2;
        if ($i42 != 0) {
            $r1 = accountTypeUiInfo.accountTypePossibilities;
        }
        int $i43 = i & 4;
        if ($i43 != 0) {
            $i1 = accountTypeUiInfo.whatYouCanDoHeader;
        }
        int $i3 = i & 8;
        if ($i3 != 0) {
            $i2 = accountTypeUiInfo.bottomText;
        }
        AccountTypeUiInfo $r0 = accountTypeUiInfo.copy($i0, $r1, $i1, $i2);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int component1() {
        int i0 = this.descriptionText;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component2() {
        List r1 = this.accountTypePossibilities;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int component3() {
        int i0 = this.whatYouCanDoHeader;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int component4() {
        int i0 = this.bottomText;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AccountTypeUiInfo copy(int i, List list, int i2, int i3) {
        Log_OC.getArray(list, "accountTypePossibilities");
        AccountTypeUiInfo $r0 = new AccountTypeUiInfo(i, list, i2, i3);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof AccountTypeUiInfo;
        if ($z0) {
            AccountTypeUiInfo $r2 = (AccountTypeUiInfo) obj;
            int $i0 = this.descriptionText;
            int $i1 = $r2.descriptionText;
            if ($i0 != $i1) {
                return false;
            }
            List $r3 = this.accountTypePossibilities;
            List $r4 = $r2.accountTypePossibilities;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                int $i02 = this.whatYouCanDoHeader;
                int $i12 = $r2.whatYouCanDoHeader;
                if ($i02 != $i12) {
                    return false;
                }
                int $i03 = this.bottomText;
                int $i13 = $r2.bottomText;
                return $i03 == $i13;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getAccountTypePossibilities() {
        List r1 = this.accountTypePossibilities;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getBottomText() {
        int i0 = this.bottomText;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getDescriptionText() {
        int i0 = this.descriptionText;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getWhatYouCanDoHeader() {
        int i0 = this.whatYouCanDoHeader;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        int $i0 = this.descriptionText;
        int $i1 = $i0 * 31;
        List $r1 = this.accountTypePossibilities;
        int $i02 = $r1.hashCode();
        int $i12 = this.whatYouCanDoHeader;
        int $i13 = this.bottomText;
        return (((($i1 + $i02) * 31) + $i12) * 31) + $i13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("AccountTypeUiInfo(descriptionText=");
        int $i0 = this.descriptionText;
        $r2.append($i0);
        $r2.append(", accountTypePossibilities=");
        List $r3 = this.accountTypePossibilities;
        $r2.append($r3);
        $r2.append(", whatYouCanDoHeader=");
        int $i02 = this.whatYouCanDoHeader;
        $r2.append($i02);
        $r2.append(", bottomText=");
        int $i03 = this.bottomText;
        $r2.append($i03);
        $r2.append(')');
        String $r1 = $r2.toString();
        return $r1;
    }
}
