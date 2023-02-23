package ai.kudi.agent.product.repository;

import java.util.List;
import kotlin.Metadata;
import p425j.p444e.AbstractC11696w;
/* compiled from: BillerRepository.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H&J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H&J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/agent/product/repository/BillerRepository;", "", "fetchAirtimeAndDataNetwork", "Lio/reactivex/Single;", "", "Lai/kudi/agent/bills/data/Biller;", "fetchBillers", "fetchFrequentlyUsedBillers", "fetchProducts", "Lai/kudi/agent/bills/data/Product;", "fetchProductsByBillerId", "billerId", "", "saveBillers", "", "billers", "saveProducts", "products", "updateFrequentlyUsed", "", "usageFrequency", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface BillerRepository {
    AbstractC11696w fetchAirtimeAndDataNetwork();

    AbstractC11696w fetchBillers();

    AbstractC11696w fetchFrequentlyUsedBillers();

    AbstractC11696w fetchProducts();

    AbstractC11696w fetchProductsByBillerId(String str);

    AbstractC11696w saveBillers(List list);

    AbstractC11696w saveProducts(List list);

    AbstractC11696w updateFrequentlyUsed(String str, int i);
}
