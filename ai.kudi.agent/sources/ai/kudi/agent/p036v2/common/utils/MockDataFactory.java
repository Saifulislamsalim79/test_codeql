package ai.kudi.agent.p036v2.common.utils;

import ai.kudi.agent.core.domain.data.MarketplaceProductModel;
import ai.kudi.agent.core.domain.data.Merchant;
import ai.kudi.agent.core.domain.data.ProductSectorModel;
import ai.kudi.agent.core.domain.data.PublicProfile;
import ai.kudi.agent.kshock.data.model.LoanStatusType;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.p557z.C13726r;
/* compiled from: MockDataFactory.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/v2/common/utils/MockDataFactory;", "", "()V", "getBestCommission", "", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "getMarketplaceProductFeatures", "", "getTopPicks", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.utils.MockDataFactory */
/* loaded from: classes.dex */
public final class MockDataFactory {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getBestCommission() {
        List $r5;
        List $r52;
        List $r53;
        List $r54;
        List $r55;
        BigDecimal $r3 = new BigDecimal(2000);
        String[] $r4 = {"Lorem ipsum dolor sit amet, consectetur adipiscing elit", "Lorem ipsum dolor sit amet, consectetur adipiscing elit", "Lorem ipsum dolor sit amet, consectetur adipiscing elit"};
        $r5 = C13726r.m3888h($r4);
        ProductSectorModel $r7 = new ProductSectorModel(7, "Business", "business", "ACTIVE", false, 16, null);
        PublicProfile $r9 = new PublicProfile(null, null, "60929e927aca9de12546f61c", "recena3899@ovooovo.com", "Northern Lite", null, null, null, null, "Abia", "Ikwuano", "7bd2b86c-7737-41e9-8638-5e91dc2c66e3", null, 106, "NOE3", "ACTIVE", null, null, null, null, null, 0, null);
        Merchant $r6 = new Merchant(106, "Northern Lite", "Silicon Valley", "northern", "7bd2b86c-7737-41e9-8638-5e91dc2c66e3", "NOE3", "60929e927aca9de12546f61c", "2021-05-05T13:33:06.166Z", null, "ACTIVE", null, "09020990098", "22222222225", "recena3899@ovooovo.com", "Abia", "Ikwuano", null, 20, null, $r7, $r9);
        ProductSectorModel $r72 = new ProductSectorModel(2, "Health and Wellness", "health-and-wellness", "ACTIVE", false, 16, null);
        MarketplaceProductModel $r1 = new MarketplaceProductModel(1029, "2021-07-20T01:31:11Z", "2021-07-20T01:31:12Z", "NOE30053", "Product Title goes here", "Lorem ipsum dolor sit amet, consectetur adipiscing elit...", $r3, "FIXED", LoanStatusType.PENDING_APPROVAL, "", 1, "COLLECTION", null, 1156, "", "", $r5, false, false, null, $r6, null, $r72);
        BigDecimal $r32 = new BigDecimal(2000);
        String[] $r42 = {"Lorem ipsum dolor sit amet, consectetur adipiscing elit", "Lorem ipsum dolor sit amet, consectetur adipiscing elit", "Lorem ipsum dolor sit amet, consectetur adipiscing elit"};
        $r52 = C13726r.m3888h($r42);
        ProductSectorModel $r73 = new ProductSectorModel(7, "Business", "business", "ACTIVE", false, 16, null);
        PublicProfile $r92 = new PublicProfile(null, null, "60929e927aca9de12546f61c", "recena3899@ovooovo.com", "Northern Lite", null, null, null, null, "Abia", "Ikwuano", "7bd2b86c-7737-41e9-8638-5e91dc2c66e3", null, 106, "NOE3", "ACTIVE", null, null, null, null, null, 0, null);
        Merchant $r62 = new Merchant(106, "Northern Lite", "Silicon Valley", "northern", "7bd2b86c-7737-41e9-8638-5e91dc2c66e3", "NOE3", "60929e927aca9de12546f61c", "2021-05-05T13:33:06.166Z", null, "ACTIVE", null, "09020990098", "22222222225", "recena3899@ovooovo.com", "Abia", "Ikwuano", null, 20, null, $r73, $r92);
        ProductSectorModel $r74 = new ProductSectorModel(2, "Health and Wellness", "health-and-wellness", "ACTIVE", false, 16, null);
        MarketplaceProductModel $r12 = new MarketplaceProductModel(1359, "2021-07-20T01:31:11Z", "2021-07-20T01:31:12Z", "NOE30053", "Product Title goes here", "Lorem ipsum dolor sit amet, consectetur adipiscing elit...", $r32, "FIXED", LoanStatusType.PENDING_APPROVAL, "", 1, "COLLECTION", null, 1156, "", "", $r52, false, false, null, $r62, null, $r74);
        $r53 = C13726r.m3891e();
        ProductSectorModel $r75 = new ProductSectorModel(7, "Business", "business", "ACTIVE", false, 16, null);
        PublicProfile $r93 = new PublicProfile(null, null, "6007e82c8a16064d2972bb35", "promise@kudi.com", "foodie", null, null, null, null, "Lagos", "Apapa", "535be43c-9c86-43f1-9b04-586fda46882e", null, 16, "FO2C", "ACTIVE", null, null, null, null, null, 0, null);
        Merchant $r63 = new Merchant(16, "foodie", "Ikeja", "wickedness", "535be43c-9c86-43f1-9b04-586fda46882e", "FO2C", "6007e82c8a16064d2972bb35", "2021-01-20T08:22:04.703Z", "2021-03-22T14:59:50.327584Z", "ACTIVE", null, "07051352479", "22228641564", "promise@kudi.com", "Lagos", "Apapa", "Ikeja", 20, "https://savings-dev.kudi.ng/collections-tool/user/collection", $r75, $r93);
        ProductSectorModel $r76 = new ProductSectorModel(1, "Transportation", "transportation", "ACTIVE", false, 16, null);
        MarketplaceProductModel $r13 = new MarketplaceProductModel(1226, "2021-07-20T01:11:30Z", "2021-07-20T01:11:30Z", "FO2CA7C7", "Product Title goes here", "Lorem ipsum dolor sit amet, consectetur adipiscing elit...", null, "PLAN", "ACTIVE", null, 1, "COLLECTION", null, 1534, null, null, $r53, false, false, null, $r63, null, $r76);
        $r54 = C13726r.m3891e();
        ProductSectorModel $r77 = new ProductSectorModel(7, "Business", "business", "ACTIVE", false, 16, null);
        PublicProfile $r94 = new PublicProfile(null, null, "6007e82c8a16064d2972bb35", "promise@kudi.com", "foodie", null, null, null, null, "Lagos", "Apapa", "535be43c-9c86-43f1-9b04-586fda46882e", null, 16, "FO2C", "ACTIVE", null, null, null, null, null, 0, null);
        Merchant $r64 = new Merchant(16, "foodie", "Ikeja", "wickedness", "535be43c-9c86-43f1-9b04-586fda46882e", "FO2C", "6007e82c8a16064d2972bb35", "2021-01-20T08:22:04.703Z", "2021-03-22T14:59:50.327584Z", "ACTIVE", null, "07051352479", "22228641564", "promise@kudi.com", "Lagos", "Apapa", "Ikeja", 20, "https://savings-dev.kudi.ng/collections-tool/user/collection", $r77, $r94);
        ProductSectorModel $r78 = new ProductSectorModel(1, "Transportation", "transportation", "ACTIVE", false, 16, null);
        MarketplaceProductModel $r14 = new MarketplaceProductModel(1926, "2021-07-20T01:11:30Z", "2021-07-20T01:11:30Z", "FO2CA7C7", "Product Title goes here", "Lorem ipsum dolor sit amet, consectetur adipiscing elit...", null, "PLAN", "ACTIVE", null, 1, "COLLECTION", null, 1534, null, null, $r54, false, false, null, $r64, null, $r78);
        MarketplaceProductModel[] $r2 = {$r1, $r12, $r13, $r14};
        $r55 = C13726r.m3888h($r2);
        return $r55;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getMarketplaceProductFeatures() {
        List $r2;
        String[] $r1 = {"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nisl, dapibus in sodales amet id.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nisl, dapibus in sodales amet id.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nisl, dapibus in sodales amet id.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nisl, dapibus in sodales amet id.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nisl, dapibus in sodales amet id.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nisl, dapibus in sodales amet id."};
        $r2 = C13726r.m3888h($r1);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getTopPicks() {
        List $r5;
        List $r52;
        List $r53;
        List $r54;
        List $r55;
        BigDecimal $r3 = new BigDecimal(2000);
        String[] $r4 = {"Lorem ipsum dolor sit amet, consectetur adipiscing elit", "Lorem ipsum dolor sit amet, consectetur adipiscing elit", "Lorem ipsum dolor sit amet, consectetur adipiscing elit"};
        $r5 = C13726r.m3888h($r4);
        ProductSectorModel $r7 = new ProductSectorModel(7, "Business", "business", "ACTIVE", false, 16, null);
        PublicProfile $r9 = new PublicProfile(null, null, "60929e927aca9de12546f61c", "recena3899@ovooovo.com", "Northern Lite", null, null, null, null, "Abia", "Ikwuano", "7bd2b86c-7737-41e9-8638-5e91dc2c66e3", null, 106, "NOE3", "ACTIVE", null, null, null, null, null, 0, null);
        Merchant $r6 = new Merchant(106, "Northern Lite", "Silicon Valley", "northern", "7bd2b86c-7737-41e9-8638-5e91dc2c66e3", "NOE3", "60929e927aca9de12546f61c", "2021-05-05T13:33:06.166Z", null, "ACTIVE", null, "09020990098", "22222222225", "recena3899@ovooovo.com", "Abia", "Ikwuano", null, 20, null, $r7, $r9);
        ProductSectorModel $r72 = new ProductSectorModel(2, "Health and Wellness", "health-and-wellness", "ACTIVE", false, 16, null);
        MarketplaceProductModel $r1 = new MarketplaceProductModel(1229, "2021-07-20T01:31:11Z", "2021-07-20T01:31:12Z", "NOE30053", "Product Title goes here", "Lorem ipsum dolor sit amet, consectetur adipiscing elit...", $r3, "FIXED", LoanStatusType.PENDING_APPROVAL, "", 1, "COLLECTION", null, 1156, "", "", $r5, false, false, null, $r6, null, $r72);
        String[] $r42 = {"Lorem ipsum dolor sit amet, consectetur adipiscing elit", "Lorem ipsum dolor sit amet, consectetur adipiscing elit", "Lorem ipsum dolor sit amet, consectetur adipiscing elit"};
        $r52 = C13726r.m3888h($r42);
        ProductSectorModel $r73 = new ProductSectorModel(7, "Business", "business", "ACTIVE", false, 16, null);
        PublicProfile $r92 = new PublicProfile(null, null, "60929e927aca9de12546f61c", "recena3899@ovooovo.com", "Northern Lite", null, null, null, null, "Abia", "Ikwuano", "7bd2b86c-7737-41e9-8638-5e91dc2c66e3", null, 106, "NOE3", "ACTIVE", null, null, null, null, null, 0, null);
        Merchant $r62 = new Merchant(106, "Northern Lite", "Silicon Valley", "northern", "7bd2b86c-7737-41e9-8638-5e91dc2c66e3", "60929e927aca9de12546f61c", "60929e927aca9de12546f61c", "2021-05-05T13:33:06.166Z", null, "ACTIVE", null, "09020990098", "22222222225", "recena3899@ovooovo.com", "Abia", "Ikwuano", null, 20, null, $r73, $r92);
        ProductSectorModel $r74 = new ProductSectorModel(2, "Health and Wellness", "health-and-wellness", "ACTIVE", false, 16, null);
        MarketplaceProductModel $r12 = new MarketplaceProductModel(1228, "2021-07-20T01:29:01Z", "2021-07-20T01:29:02Z", "NOE3CAE7", "Task Force 154", "Lorem ipsum dolor sit amet, consectetur adipiscing elit...", null, "DYNAMIC", LoanStatusType.PENDING_APPROVAL, "", 1, "COLLECTION", "https://bolanle.requestcatcher.com/test", 1550, "https://bolanle.requestcatcher.com/test", "https://8bf4908a131b57acc26cf3c8b3f6becb.m.pipedream.net", $r52, false, false, null, $r62, null, $r74);
        $r53 = C13726r.m3891e();
        ProductSectorModel $r75 = new ProductSectorModel(7, "Business", "business", "ACTIVE", false, 16, null);
        PublicProfile $r93 = new PublicProfile(null, null, "6007e82c8a16064d2972bb35", "promise@kudi.com", "foodie", null, null, null, null, "Lagos", "Apapa", "535be43c-9c86-43f1-9b04-586fda46882e", null, 16, "FO2C", "ACTIVE", null, null, null, null, null, 0, null);
        Merchant $r63 = new Merchant(16, "foodie", "Ikeja", "wickedness", "535be43c-9c86-43f1-9b04-586fda46882e", "FO2C", "6007e82c8a16064d2972bb35", "2021-01-20T08:22:04.703Z", "2021-03-22T14:59:50.327584Z", "ACTIVE", null, "07051352479", "22228641564", "promise@kudi.com", "Lagos", "Apapa", "Ikeja", 20, "https://savings-dev.kudi.ng/collections-tool/user/collection", $r75, $r93);
        ProductSectorModel $r76 = new ProductSectorModel(1, "Transportation", "transportation", "ACTIVE", false, 16, null);
        MarketplaceProductModel $r13 = new MarketplaceProductModel(1226, "2021-07-20T01:11:30Z", "2021-07-20T01:11:30Z", "FO2CA7C7", "Product Title goes here", "Lorem ipsum dolor sit amet, consectetur adipiscing elit...", null, "PLAN", "ACTIVE", null, 1, "COLLECTION", null, 1534, null, null, $r53, false, false, null, $r63, null, $r76);
        $r54 = C13726r.m3891e();
        ProductSectorModel $r77 = new ProductSectorModel(7, "Business", "business", "ACTIVE", false, 16, null);
        PublicProfile $r94 = new PublicProfile(null, null, "6007e82c8a16064d2972bb35", "promise@kudi.com", "foodie", null, null, null, null, "Lagos", "Apapa", "535be43c-9c86-43f1-9b04-586fda46882e", null, 16, "FO2C", "ACTIVE", null, null, null, null, null, 0, null);
        Merchant $r64 = new Merchant(16, "foodie", "Ikeja", "wickedness", "535be43c-9c86-43f1-9b04-586fda46882e", "FO2C", "6007e82c8a16064d2972bb35", "2021-01-20T08:22:04.703Z", "2021-03-22T14:59:50.327584Z", "ACTIVE", null, "07051352479", "22228641564", "promise@kudi.com", "Lagos", "Apapa", "Ikeja", 20, "https://savings-dev.kudi.ng/collections-tool/user/collection", $r77, $r94);
        ProductSectorModel $r78 = new ProductSectorModel(1, "Transportation", "transportation", "ACTIVE", false, 16, null);
        MarketplaceProductModel $r14 = new MarketplaceProductModel(1926, "2021-07-20T01:11:30Z", "2021-07-20T01:11:30Z", "FO2CA7C7", "Product Title goes here", "Lorem ipsum dolor sit amet, consectetur adipiscing elit...", null, "PLAN", "ACTIVE", null, 1, "COLLECTION", null, 1534, null, null, $r54, false, false, null, $r64, null, $r78);
        MarketplaceProductModel[] $r2 = {$r1, $r12, $r13, $r14};
        $r55 = C13726r.m3888h($r2);
        return $r55;
    }
}
