package ai.kudi.agent.bills.data;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import java.util.List;
import kotlin.Metadata;
import kotlin.p557z.C13726r;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
/* compiled from: BillerFactory.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/bills/data/ProductFactory;", "", "()V", "products", "", "Lai/kudi/agent/bills/data/Product;", "getProducts", "()Ljava/util/List;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ProductFactory {
    public static final ProductFactory INSTANCE;
    private static final List<Product> products;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        List $r10;
        List $r102;
        List $r103;
        List $r104;
        List $r105;
        List $r106;
        List $r107;
        List $r108;
        List $r109;
        List $r1010;
        List $r1011;
        ProductFactory $r0 = new ProductFactory();
        INSTANCE = $r0;
        Product $r2 = new Product("1", "DStv Access", 2000, "dstv", null, 0, "dstv", null, false, 432, null);
        Product $r22 = new Product("2", "DStv Family", 4000, "dstv", null, 0, "dstv", null, false, 432, null);
        Product $r23 = new Product("3", "DStv Compact", 6800, "dstv", null, 0, "dstv", null, false, 432, null);
        Product $r24 = new Product("4", "DStv Compact Plus", 10650, "dstv", null, 0, "dstv", null, false, 432, null);
        Product $r25 = new Product("5", "DStv Premium", 15800, "dstv", null, 0, "dstv", null, false, 432, null);
        Product $r26 = new Product("6", "DStv Premium - HD", 18000, "dstv", null, 0, "dstv", null, false, 432, null);
        Product $r27 = new Product("7", "DStv Compact Plus - PVR Access", 11480, "dstv", null, 0, "dstv", null, false, 432, null);
        Product $r28 = new Product("8", "DStv Compact Plus - Extra View", 12850, "dstv", null, 0, "dstv", null, false, 432, null);
        Product $r29 = new Product("11", "DStv Premium - Extra View", 18000, "dstv", null, 0, "dstv", null, false, 432, null);
        Product $r210 = new Product("12", "DStv Premium Dual View", 16140, "dstv", null, 0, "dstv", null, false, 432, null);
        Product $r211 = new Product("13", "DStv Compact Extra View", 9000, "dstv", null, 0, "dstv", null, false, 432, null);
        Product $r212 = new Product("16", "DStv Yanga", 2500, "dstv", null, 0, "dstv", null, false, 432, null);
        Product $r213 = new Product("17", "DStv Confam", 4500, "dstv", null, 0, "dstv", null, false, 432, null);
        Product $r214 = new Product("4", "GOtv Lite", 400, "gotv", null, 0, "gotv", null, false, 432, null);
        Product $r215 = new Product("2", "GOtv Value", 1250, "gotv", null, 0, "gotv", null, false, 432, null);
        Product $r216 = new Product("3", "GOtv Plus", 1900, "gotv", null, 0, "gotv", null, false, 432, null);
        Product $r217 = new Product("5", "GOtv Max", 3200, "gotv", null, 0, "gotv", null, false, 432, null);
        Product $r218 = new Product("6", "GOtv Jolli", 2400, "gotv", null, 0, "gotv", null, false, 432, null);
        Product $r219 = new Product("7", "GOtv Jinja", 1600, "gotv", null, 0, "gotv", null, false, 432, null);
        Integer $r8 = Integer.valueOf((int) IMediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR);
        Product $r220 = new Product("1", "Nova", $r8, "startimes", null, 0, "startimes", null, false, 432, null);
        Product $r221 = new Product("2", "Basic", 1300, "startimes", null, 0, "startimes", null, false, 432, null);
        Product $r222 = new Product("3", "Smart", 1900, "startimes", null, 0, "startimes", null, false, 432, null);
        Product $r223 = new Product("4", "Classic", 1900, "startimes", null, 0, "startimes", null, false, 432, null);
        Product $r224 = new Product("5", "Unique", 3800, "startimes", null, 0, "startimes", null, false, 432, null);
        Product $r225 = new Product("6", "Super", 3800, "startimes", null, 0, "startimes", null, false, 432, null);
        String[] $r9 = {"prepaid", "postpaid"};
        $r10 = C13726r.m3888h($r9);
        Product $r226 = new Product("ikeja", "Ikeja Electric", null, TransactionBreakDownItemType.PHCN, $r10, 0, "ikeja", null, false, 416, null);
        String[] $r92 = {"prepaid", "postpaid"};
        $r102 = C13726r.m3888h($r92);
        Product $r227 = new Product("eko", "Eko Electric", null, TransactionBreakDownItemType.PHCN, $r102, 0, "eko", null, false, 416, null);
        String[] $r93 = {"prepaid", "postpaid"};
        $r103 = C13726r.m3888h($r93);
        Product $r228 = new Product("abuja", "Abuja Electric", null, TransactionBreakDownItemType.PHCN, $r103, 0, "abuja", null, false, 416, null);
        String[] $r94 = {"prepaid", "postpaid"};
        $r104 = C13726r.m3888h($r94);
        Product $r229 = new Product("kano", "Kano Electric", null, TransactionBreakDownItemType.PHCN, $r104, 0, "kano", null, false, 416, null);
        String[] $r95 = {"prepaid", "postpaid"};
        $r105 = C13726r.m3888h($r95);
        Product $r230 = new Product("phed", "Port Harcourt Electric", null, TransactionBreakDownItemType.PHCN, $r105, 0, "phed", null, false, 416, null);
        String[] $r96 = {"prepaid", "postpaid"};
        $r106 = C13726r.m3888h($r96);
        Product $r231 = new Product("ibedc", "Ibadan Electric", null, TransactionBreakDownItemType.PHCN, $r106, 0, "ibedc", null, false, 416, null);
        String[] $r97 = {"prepaid", "postpaid"};
        $r107 = C13726r.m3888h($r97);
        Product $r232 = new Product("jed", "Jos Electric", null, TransactionBreakDownItemType.PHCN, $r107, 0, "jed", null, false, 416, null);
        String[] $r98 = {"prepaid", "postpaid"};
        $r108 = C13726r.m3888h($r98);
        Product $r233 = new Product("kaduna", "Kaduna Electric", null, TransactionBreakDownItemType.PHCN, $r108, 0, "kaduna", null, false, 416, null);
        String[] $r99 = {"prepaid", "postpaid"};
        $r109 = C13726r.m3888h($r99);
        Product $r234 = new Product("enugu", "Enugu Electric", null, TransactionBreakDownItemType.PHCN, $r109, 0, "enugu", null, false, 416, null);
        Product $r235 = new Product("smile_1_5GB_valueplus", "1.5GB ValuePlus Plan", 1020, "smile", null, 0, "smile", "smile12", false, 272, null);
        Product $r236 = new Product("smile_5GB_valueplus", "5GB with 50% day + 50% night use", 3070, "smile", null, 0, "smile", "smile13", false, 272, null);
        Product $r237 = new Product("smile_11GB_valueplus", "11GB with 50% day + 50% night use", 5110, "smile", null, 0, "smile", "smile14", false, 272, null);
        Product $r238 = new Product("smile_7GB_valueplus", "7GB with 50% day + 50% night use", 4090, "smile", null, 0, "smile", "smile15", false, 272, null);
        Product $r239 = new Product("smile_15GB_valueplus", "15GB with 50% day + 50% night use", 6140, "smile", null, 0, "smile", "smile16", false, 272, null);
        Product $r240 = new Product("smile_21GB_valueplus", "21GB with 50% day + 50% night use", 8190, "smile", null, 0, "smile", "smile17", false, 272, null);
        Product $r241 = new Product("smile_31GB_valueplus", "31GB with 50% day + 50% night use", 11260, "smile", null, 0, "smile", "smile18", false, 272, null);
        Product $r242 = new Product("smile_flexi_daily", "Flexi Daily plan", 350, "smile", null, 0, "smile", "smile7", false, 272, null);
        Product $r243 = new Product("smile_flexi_weekly", "Flexi Weekly plan", 1020, "smile", null, 0, "smile", "smile8", false, 272, null);
        Product $r244 = new Product("smile_3GB_weekly", "3GB Weekend Only Plan", 1530, "smile", null, 0, "smile", "smile1", false, 272, null);
        Product $r245 = new Product("smile_2GB_midnite", "2GB MidNite Plan", 1020, "smile", null, 0, "smile", "smile23", false, 272, null);
        Product $r246 = new Product("smile_3GB_midnite", "3GB MidNite Pla", 1530, "smile", null, 0, "smile", "smile22", false, 272, null);
        Product $r247 = new Product("smile_10GB_anytime", "10GB Anytime Plan", 8190, "smile", null, 0, "smile", "smile3", false, 272, null);
        Product $r248 = new Product("smile_20GB_anytime", "20GB Anytime Plan", 16380, "smile", null, 0, "smile", "smile4", false, 272, null);
        Product $r249 = new Product("smile_50GB_anytime", "50GB Anytime plan", 36850, "smile", null, 0, "smile", "smile5", false, 272, null);
        Product $r250 = new Product("smile_100GB_anytime", "100GB Anytime Plan", 71650, "smile", null, 0, "smile", "smile9", false, 272, null);
        Product $r251 = new Product("smile_200GB_anytime", "200GB Anytime Plan", 138200, "smile", null, 0, "smile", "smile24", false, 272, null);
        Product $r252 = new Product("smile_30GB_bumpavalue", "30GB Bumpa Value plan", 15350, "smile", null, 0, "smile", "smile6", false, 272, null);
        Product $r253 = new Product("smile_60GB_bumpavalue", "60GB Bumpa Value plan", 30700, "smile", null, 0, "smile", "smile25", false, 272, null);
        Product $r254 = new Product("smile_80GB_bumpavalue", "80GB Bumpa Value plan", 40950, "smile", null, 0, "smile", "smile26", false, 272, null);
        Product $r255 = new Product("smile_unlimited_lite", "Unlimited Lite Plan", 10230, "smile", null, 0, "smile", "smile2", false, 272, null);
        Product $r256 = new Product("smile_unlimited_essential", "Unlimited Essential Plan", 15350, "smile", null, 0, "smile", "smile20", false, 272, null);
        Product $r257 = new Product("smile_unlimited_premium", "Unlimited Premium Plan", 20270, "smile", null, 0, "smile", "smile27", false, 272, null);
        Product $r258 = new Product("smile_unlimited_platinum", "Unlimited Premium Platinum", 24000, "smile", null, 0, "smile", "smile28", false, 272, null);
        Product $r259 = new Product("62120", "50MB + 10% Bonus - 1Day", 100, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel1", false, 272, null);
        Product $r260 = new Product("62120", "200MB + 10% Bonus - 3Days", 200, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel2", false, 272, null);
        Integer $r82 = Integer.valueOf((int) IjkMediaCodecInfo.RANK_SECURE);
        Product $r261 = new Product("62120", "350MB + 10% Bonus - 7 Days", $r82, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel3", false, 272, null);
        Product $r262 = new Product("62120", "750MB + 10% Bonus - 14 Days", 500, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel4", false, 272, null);
        Product $r263 = new Product("62120", "1.5GB + 10% Bonus for Social Media - 30 Days", 1000, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel5", false, 272, null);
        Product $r264 = new Product("62120", "3.5GB + 10% Bonus for Social Media - 30 Days", 2000, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel6", false, 272, null);
        Product $r265 = new Product("62120", "5GB + 10% Bonus for Social Media - 30 Days", 2500, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel7", false, 272, null);
        Product $r266 = new Product("62120", "7GB + 10% Bonus for Social Media - 30 Days", 3500, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel8", false, 272, null);
        Product $r267 = new Product("62120", "9GB + 10% Bonus for Social Media - 30 Days", 4000, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel9", false, 272, null);
        Product $r268 = new Product("62120", "10GB + 10% Bonus - 30 Days", 5000, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel10", false, 272, null);
        Product $r269 = new Product("62120", "16GB + 10% Bonus - 30 Days", 8000, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel11", false, 272, null);
        Product $r270 = new Product("62120", "22GB + 10% Bonus - 30 Days", 10000, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel12", false, 272, null);
        Product $r271 = new Product("62120", "30GB + 10% Bonus - 30 Days", 15000, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel13", false, 272, null);
        Product $r272 = new Product("62120", "50GB + 10% Bonus - 30 Days", 36000, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel14", false, 272, null);
        Product $r273 = new Product("62120", "100GB + 10% Bonus - 30 Days", 70000, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel15", false, 272, null);
        Product $r274 = new Product("62120", "200GB + 10% Bonus - 30 Days", 136000, TransactionBreakDownItemType.DATA, null, 0, "62120", "airtel16", false, 272, null);
        Product $r275 = new Product("62130", "N100 30MB - 24hrs", 100, TransactionBreakDownItemType.DATA, null, 0, "62130", "mtn1", false, 272, null);
        Product $r276 = new Product("62130", "N200 100MB - 24hrs", 200, TransactionBreakDownItemType.DATA, null, 0, "62130", "mtn2", false, 272, null);
        Product $r277 = new Product("62130", "N500 750MB - 7 Days", 500, TransactionBreakDownItemType.DATA, null, 0, "62130", "mtn3", false, 272, null);
        Product $r278 = new Product("62130", "N1000 1.5GB - 30days", 1000, TransactionBreakDownItemType.DATA, null, 0, "62130", "mtn4", false, 272, null);
        Product $r279 = new Product("62130", "N2000 3.5GB - 30days", 2000, TransactionBreakDownItemType.DATA, null, 0, "62130", "mtn5", false, 272, null);
        Product $r280 = new Product("62130", "MTN Data Bundle - 5000 Naira", 5000, TransactionBreakDownItemType.DATA, null, 0, "62130", "mtn6", false, 272, null);
        Product $r281 = new Product("62130", "MTN Data Bundle - 6000 Naira - 30 days", 6000, TransactionBreakDownItemType.DATA, null, 0, "62130", "mtn7", false, 272, null);
        Product $r282 = new Product("62130", "MTN Data Bundle - 6500 Naira", 6500, TransactionBreakDownItemType.DATA, null, 0, "62130", "mtn8", false, 272, null);
        Product $r283 = new Product("62130", "MTN Data Bundle - 8000 Naira", 8000, TransactionBreakDownItemType.DATA, null, 0, "62130", "mtn9", false, 272, null);
        Product $r284 = new Product("62130", "MTN Data Bundle - 13000 Naira", 13000, TransactionBreakDownItemType.DATA, null, 0, "62130", "mtn10", false, 272, null);
        Product $r285 = new Product("62160", "9mobile Data Bundle - 100 Naira", 100, TransactionBreakDownItemType.DATA, null, 0, "62160", "9mobile1", false, 272, null);
        Product $r286 = new Product("62160", "9mobile Data Bundle - 500 Naira", 500, TransactionBreakDownItemType.DATA, null, 0, "62160", "9mobile2", false, 272, null);
        Product $r287 = new Product("62160", "9mobile Data Bundle - 1000 Naira", 1000, TransactionBreakDownItemType.DATA, null, 0, "62160", "9mobile3", false, 272, null);
        Product $r288 = new Product("62160", "9mobile Data Bundle - 2000 Naira", 2000, TransactionBreakDownItemType.DATA, null, 0, "62160", "9mobile4", false, 272, null);
        Product $r289 = new Product("62160", "9mobile Data Bundle - 8000 Naira", 8000, TransactionBreakDownItemType.DATA, null, 0, "62160", "9mobile5", false, 272, null);
        Product $r290 = new Product("62160", "9mobile Data Bundle - 10000 Naira", 10000, TransactionBreakDownItemType.DATA, null, 0, "62160", "9mobile6", false, 272, null);
        Product $r291 = new Product("62160", "9mobile Data Bundle - 15000 Naira", 15000, TransactionBreakDownItemType.DATA, null, 0, "62160", "9mobile7", false, 272, null);
        Product $r292 = new Product("62160", "9mobile Data Bundle - 18,000 Naira", 18000, TransactionBreakDownItemType.DATA, null, 0, "62160", "9mobile8", false, 272, null);
        Product $r293 = new Product("62160", "9mobile Data Bundle - 27,500 Naira", 27500, TransactionBreakDownItemType.DATA, null, 0, "62160", "9mobile9", false, 272, null);
        Product $r294 = new Product("62160", "9mobile Data Bundle - 55,000 Naira", 55000, TransactionBreakDownItemType.DATA, null, 0, "62160", "9mobile10", false, 272, null);
        Product $r295 = new Product("62160", "9mobile Data Bundle - 110,000 Naira", 110000, TransactionBreakDownItemType.DATA, null, 0, "62160", "9mobile11", false, 272, null);
        $r1010 = C13726r.m3891e();
        Product $r296 = new Product("bet9ja", "Bet 9ja", null, TransactionBreakDownItemType.BETTING, $r1010, 0, "bet9ja", null, false, 416, null);
        Product[] $r1 = {$r2, $r22, $r23, $r24, $r25, $r26, $r27, $r28, $r29, $r210, $r211, $r212, $r213, $r214, $r215, $r216, $r217, $r218, $r219, $r220, $r221, $r222, $r223, $r224, $r225, $r226, $r227, $r228, $r229, $r230, $r231, $r232, $r233, $r234, $r235, $r236, $r237, $r238, $r239, $r240, $r241, $r242, $r243, $r244, $r245, $r246, $r247, $r248, $r249, $r250, $r251, $r252, $r253, $r254, $r255, $r256, $r257, $r258, $r259, $r260, $r261, $r262, $r263, $r264, $r265, $r266, $r267, $r268, $r269, $r270, $r271, $r272, $r273, $r274, $r275, $r276, $r277, $r278, $r279, $r280, $r281, $r282, $r283, $r284, $r285, $r286, $r287, $r288, $r289, $r290, $r291, $r292, $r293, $r294, $r295, $r296};
        $r1011 = C13726r.m3888h($r1);
        products = $r1011;
    }

    private ProductFactory() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getProducts() {
        List r1 = products;
        return r1;
    }
}
