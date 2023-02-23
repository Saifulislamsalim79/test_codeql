package ai.kudi.agent.product.repository;

import android.content.SharedPreferences;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: BillerRepositoryImpl.kt */
@Metadata(m10422d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0017J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0017J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u000fH\u0016J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00100\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\"\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00100\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010H\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0016R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\""}, m10421d2 = {"Lai/kudi/agent/product/repository/BillerRepositoryImpl;", "Lai/kudi/agent/product/repository/BillerRepository;", "localdb", "sharedPreferences", "Landroid/content/SharedPreferences;", "remotedb", "Lai/kudi/agent/product/repository/RemoteBillerRepositoryImpl;", "(Lai/kudi/agent/product/repository/BillerRepository;Landroid/content/SharedPreferences;Lai/kudi/agent/product/repository/RemoteBillerRepositoryImpl;)V", "getLocaldb", "()Lai/kudi/agent/product/repository/BillerRepository;", "getRemotedb", "()Lai/kudi/agent/product/repository/RemoteBillerRepositoryImpl;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "fetchAirtimeAndDataNetwork", "Lio/reactivex/Single;", "", "Lai/kudi/agent/bills/data/Biller;", "fetchBillers", "fetchFrequentlyUsedBillers", "fetchProducts", "Lai/kudi/agent/bills/data/Product;", "fetchProductsByBillerId", "billerId", "", "saveBillers", "", "billers", "saveProducts", "products", "updateFrequentlyUsed", "", "usageFrequency", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BillerRepositoryImpl implements BillerRepository {
    private final BillerRepository localdb;
    private final RemoteBillerRepositoryImpl remotedb;
    private final SharedPreferences sharedPreferences;

    public BillerRepositoryImpl(BillerRepository billerRepository, SharedPreferences sharedPreferences, RemoteBillerRepositoryImpl remoteBillerRepositoryImpl) {
        Log_OC.getArray(billerRepository, "localdb");
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        Log_OC.getArray(remoteBillerRepositoryImpl, "remotedb");
        this.localdb = billerRepository;
        this.sharedPreferences = sharedPreferences;
        this.remotedb = remoteBillerRepositoryImpl;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w fetchAirtimeAndDataNetwork() {
        BillerRepository $r2 = this.localdb;
        AbstractC11696w $r1 = $r2.fetchAirtimeAndDataNetwork();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w fetchBillers() {
        BillerRepository $r2 = this.localdb;
        AbstractC11696w $r1 = $r2.fetchBillers();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w fetchFrequentlyUsedBillers() {
        SharedPreferences $r1 = this.sharedPreferences;
        boolean $z0 = !$r1.getBoolean(BillerRepositoryImplKt.HAS_SETUP_BILLERS_AND_PRODUCT, false);
        RemoteBillerRepositoryImpl $r2 = this.remotedb;
        BillerRepositoryImpl$fetchFrequentlyUsedBillers$1 $r3 = new BillerRepositoryImpl$fetchFrequentlyUsedBillers$1(this);
        $r2.fetchBillers($z0, $r3);
        RemoteBillerRepositoryImpl $r22 = this.remotedb;
        BillerRepositoryImpl$fetchFrequentlyUsedBillers$2 $r4 = new BillerRepositoryImpl$fetchFrequentlyUsedBillers$2(this);
        $r22.fetchProducts($z0, $r4);
        BillerRepository $r5 = this.localdb;
        AbstractC11696w $r6 = $r5.fetchFrequentlyUsedBillers();
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w fetchProducts() {
        BillerRepository $r1 = this.localdb;
        AbstractC11696w $r2 = $r1.fetchProducts();
        Item $r3 = ClassWriter.LogError();
        AbstractC11696w $r22 = $r2.u($r3);
        Log_OC.loadImage($r22, "localdb.fetchProducts().subscribeOn(Schedulers.io())");
        return $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w fetchProductsByBillerId(String str) {
        Log_OC.getArray(str, "billerId");
        BillerRepository $r2 = this.localdb;
        AbstractC11696w $r3 = $r2.fetchProductsByBillerId(str);
        Item $r4 = ClassWriter.LogError();
        AbstractC11696w $r32 = $r3.u($r4);
        Item $r42 = ContextUtils.LogError();
        AbstractC11696w $r33 = $r32.n($r42);
        Log_OC.loadImage($r33, "localdb.fetchProductsByBillerId(billerId).subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r33;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BillerRepository getLocaldb() {
        BillerRepository r1 = this.localdb;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RemoteBillerRepositoryImpl getRemotedb() {
        RemoteBillerRepositoryImpl r1 = this.remotedb;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences r1 = this.sharedPreferences;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w saveBillers(List list) {
        Log_OC.getArray(list, "billers");
        BillerRepository $r2 = this.localdb;
        AbstractC11696w $r3 = $r2.saveBillers(list);
        Item $r4 = ClassWriter.LogError();
        AbstractC11696w $r32 = $r3.u($r4);
        Log_OC.loadImage($r32, "localdb.saveBillers(billers).subscribeOn(Schedulers.io())");
        return $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w saveProducts(List list) {
        Log_OC.getArray(list, "products");
        BillerRepository $r2 = this.localdb;
        AbstractC11696w $r3 = $r2.saveProducts(list);
        Item $r4 = ClassWriter.LogError();
        AbstractC11696w $r32 = $r3.u($r4);
        Log_OC.loadImage($r32, "localdb.saveProducts(products).subscribeOn(Schedulers.io())");
        return $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.repository.BillerRepository
    public AbstractC11696w updateFrequentlyUsed(String str, int i) {
        Log_OC.getArray(str, "billerId");
        BillerRepository $r3 = this.localdb;
        AbstractC11696w $r1 = $r3.updateFrequentlyUsed(str, i);
        return $r1;
    }
}
