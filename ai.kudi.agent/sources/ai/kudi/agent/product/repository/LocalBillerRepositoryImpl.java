package ai.kudi.agent.product.repository;

import ai.kudi.agent.core.domain.p004db.CoreAppDatabase;
import ai.kudi.agent.core.domain.p004db.room_dao.BillerDao;
import ai.kudi.agent.core.domain.p004db.room_dao.ProductDao;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: LocalBillerRepositoryImpl.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\bH\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001b"}, m10421d2 = {"Lai/kudi/agent/product/repository/LocalBillerRepositoryImpl;", "Lai/kudi/agent/product/repository/BillerRepository;", "db", "Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "(Lai/kudi/agent/core/domain/db/CoreAppDatabase;)V", "getDb", "()Lai/kudi/agent/core/domain/db/CoreAppDatabase;", "fetchAirtimeAndDataNetwork", "Lio/reactivex/Single;", "", "Lai/kudi/agent/bills/data/Biller;", "fetchBillers", "fetchFrequentlyUsedBillers", "fetchProducts", "Lai/kudi/agent/bills/data/Product;", "fetchProductsByBillerId", "billerId", "", "saveBillers", "", "billers", "saveProducts", "products", "updateFrequentlyUsed", "", "usageFrequency", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LocalBillerRepositoryImpl implements BillerRepository {
    private final CoreAppDatabase orient;

    public LocalBillerRepositoryImpl(CoreAppDatabase coreAppDatabase) {
        Log_OC.getArray(coreAppDatabase, "db");
        this.orient = coreAppDatabase;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w fetchAirtimeAndDataNetwork() {
        CoreAppDatabase $r1 = this.orient;
        BillerDao $r2 = $r1.billerDao();
        AbstractC11696w $r3 = BillerDao.DefaultImpls.getNetworksForAirtimeAndData$default($r2, null, 1, null);
        Item $r4 = ClassWriter.LogError();
        AbstractC11696w $r32 = $r3.u($r4);
        Item $r42 = ContextUtils.LogError();
        AbstractC11696w $r33 = $r32.n($r42);
        Log_OC.loadImage($r33, "db.billerDao().getNetworksForAirtimeAndData().subscribeOn(Schedulers.io()).observeOn(\n                AndroidSchedulers.mainThread())");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w fetchBillers() {
        CoreAppDatabase $r1 = this.orient;
        BillerDao $r2 = $r1.billerDao();
        AbstractC11696w $r3 = BillerDao.DefaultImpls.getBillersWithoutData$default($r2, null, 1, null);
        Item $r4 = ClassWriter.LogError();
        AbstractC11696w $r32 = $r3.u($r4);
        Item $r42 = ContextUtils.LogError();
        AbstractC11696w $r33 = $r32.n($r42);
        Log_OC.loadImage($r33, "db.billerDao().getBillersWithoutData().subscribeOn(Schedulers.io()).observeOn(\n                AndroidSchedulers.mainThread())");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w fetchFrequentlyUsedBillers() {
        CoreAppDatabase $r1 = this.orient;
        BillerDao $r2 = $r1.billerDao();
        AbstractC11696w $r3 = BillerDao.DefaultImpls.getFrequentlyUsedBillers$default($r2, null, 1, null);
        Item $r4 = ClassWriter.LogError();
        AbstractC11696w $r32 = $r3.u($r4);
        Item $r42 = ContextUtils.LogError();
        AbstractC11696w $r33 = $r32.n($r42);
        Log_OC.loadImage($r33, "db.billerDao().getFrequentlyUsedBillers().subscribeOn(Schedulers.io()).observeOn(\n                AndroidSchedulers.mainThread())");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w fetchProducts() {
        CoreAppDatabase $r1 = this.orient;
        ProductDao $r2 = $r1.productDao();
        AbstractC11696w $r3 = $r2.fetchProducts();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w fetchProductsByBillerId(String str) {
        Log_OC.getArray(str, "billerId");
        CoreAppDatabase $r2 = this.orient;
        ProductDao $r3 = $r2.productDao();
        AbstractC11696w $r4 = $r3.fetchProducts(str);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CoreAppDatabase getDb() {
        CoreAppDatabase r1 = this.orient;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w saveBillers(List list) {
        Log_OC.getArray(list, "billers");
        CoreAppDatabase $r2 = this.orient;
        BillerDao $r3 = $r2.billerDao();
        AbstractC11696w $r4 = $r3.saveBillers(list);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w saveProducts(List list) {
        Log_OC.getArray(list, "products");
        CoreAppDatabase $r2 = this.orient;
        ProductDao $r3 = $r2.productDao();
        AbstractC11696w $r4 = $r3.saveProducts(list);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w updateFrequentlyUsed(String str, int i) {
        Log_OC.getArray(str, "billerId");
        CoreAppDatabase $r2 = this.orient;
        BillerDao $r3 = $r2.billerDao();
        AbstractC11696w $r4 = $r3.updateBillers(str, i);
        return $r4;
    }
}
