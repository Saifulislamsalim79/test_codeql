package ai.kudi.agent.bills.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.p557z.C13726r;
/* compiled from: BillerFactory.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/bills/data/BillerFactory;", "", "()V", "billers", "", "Lai/kudi/agent/bills/data/Biller;", "getBillers", "()Ljava/util/List;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BillerFactory {
    public static final BillerFactory INSTANCE;
    private static final List<Biller> billers;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        List $r0;
        BillerFactory $r1 = new BillerFactory();
        INSTANCE = $r1;
        Biller $r3 = new Biller("dstv", "DSTV", "Smart Card Number", "https://res.cloudinary.com/kudiagent/image/upload/v1586341304/dstv_vi4gpp.png", "Cable Television", false, null, false, 0, 224, null);
        Biller $r32 = new Biller("gotv", "GOtv", "Decoder Number (IUC)", "https://res.cloudinary.com/kudiagent/image/upload/v1586341304/gotv_a1233n.png", "Cable Television", false, null, false, 0, 224, null);
        Biller $r33 = new Biller("startimes", "Startimes", "Smart Card Number", "https://res.cloudinary.com/kudiagent/image/upload/v1586341304/Group_86_mulkqi.png", "Cable Television", false, null, false, 0, 224, null);
        Biller $r34 = new Biller("ikeja", "Ikeja Electric", "Account Number or Meter Number", "https://res.cloudinary.com/kudiagent/image/upload/v1586340964/Group_81_tl3wex.png", "Electricity", false, null, false, 0, 224, null);
        Biller $r35 = new Biller("eko", "Eko Electric", "Account Number or Meter Number", "https://res.cloudinary.com/kudiagent/image/upload/v1586340725/Group_82_fjmubd.png", "Electricity", false, null, false, 0, 224, null);
        Biller $r36 = new Biller("abuja", "Abuja Electric", "Account Number or Meter Number", "https://res.cloudinary.com/kudiagent/image/upload/v1586340964/Group_79_okcurb.png", "Electricity", false, null, false, 0, 224, null);
        Biller $r37 = new Biller("kano", "Kano Electric", "Account Number or Meter Number", "https://res.cloudinary.com/kudiagent/image/upload/v1586340964/Group_83_mdkgpj.png", "Electricity", false, null, false, 0, 224, null);
        Biller $r38 = new Biller("phed", "Port Harcourt Electric", "Account Number or Meter Number", "https://res.cloudinary.com/kudiagent/image/upload/v1586340963/Group_76_zggbaj.png", "Electricity", false, null, false, 0, 224, null);
        Biller $r39 = new Biller("ibedc", "Ibadan Electric", "Account Number or Meter Number", "https://res.cloudinary.com/kudiagent/image/upload/v1586340965/ibedc_nyspd5.png", "Electricity", false, null, false, 0, 224, null);
        Biller $r310 = new Biller("jed", "Jos Electric", "Account Number or Meter Number", "https://res.cloudinary.com/kudiagent/image/upload/v1586340964/Group_78_ic3if1.png", "Electricity", false, null, false, 0, 224, null);
        Biller $r311 = new Biller("kaduna", "Kaduna Electric", "Account Number or Meter Number", "https://res.cloudinary.com/kudiagent/image/upload/v1586340964/Group_84_xhuurj.png", "Electricity", false, null, false, 0, 224, null);
        Biller $r312 = new Biller("enugu", "Enugu Electric", "Account Number or Meter Number", "https://res.cloudinary.com/kudiagent/image/upload/v1586340964/Group_77_fcfmrb.png", "Electricity", false, null, false, 0, 224, null);
        Biller $r313 = new Biller("smile", "Smile", "Customer ID", "https://res.cloudinary.com/kudiagent/image/upload/v1586340962/Group_71_fmgmxh.png", "Internet Subscription", true, null, false, 0, 192, null);
        Biller $r314 = new Biller("62120", "Airtel", "Phone Number", "https://www.vtpass.com/resources/products/200X200/Airtel-Airtime.jpg", null, false, null, false, 0, 240, null);
        Biller $r315 = new Biller("62130", "MTN", "Phone Number", "https://www.vtpass.com/resources/products/200X200/MTN-Airtime.jpg", null, false, null, false, 0, 240, null);
        Biller $r316 = new Biller("62150", "GLO", "Phone Number", "https://www.vtpass.com/resources/products/200X200/GLO-Airtime.jpg", null, false, null, false, 0, 240, null);
        Biller $r317 = new Biller("62160", "9Mobile", "Phone Number", "https://3.bp.blogspot.com/-XGeuEBHwtuM/WYtHF_WyMKI/AAAAAAAACyU/5ZqlXhoifAQDbMa-PAOvGU2Y0NQj8_xIQCLcBGAs/s1600/Get-Free-200MB-from-9mobile%20.JPG", null, false, null, false, 0, 240, null);
        Biller $r318 = new Biller("bet9ja", "Bet 9ja", "Account Number or Meter Number", "https://res.cloudinary.com/kudiagent/image/upload/v1586340964/Group_77_fcfmrb.png", "Sports Betting", false, null, false, 0, 224, null);
        Biller[] $r2 = {$r3, $r32, $r33, $r34, $r35, $r36, $r37, $r38, $r39, $r310, $r311, $r312, $r313, $r314, $r315, $r316, $r317, $r318};
        $r0 = C13726r.m3888h($r2);
        billers = $r0;
    }

    private BillerFactory() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getBillers() {
        List r1 = billers;
        return r1;
    }
}
