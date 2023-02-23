package ai.kudi.agent.banks.domain;

import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p470j0.ClassWriter;
import p590o.p591a.Timber;
/* compiled from: BanksRepository.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/banks/domain/BanksRepository;", "", "banksLocalSource", "Lai/kudi/agent/banks/domain/BanksLocalSource;", "banksRemoteSource", "Lai/kudi/agent/banks/domain/BanksRemoteSource;", "(Lai/kudi/agent/banks/domain/BanksLocalSource;Lai/kudi/agent/banks/domain/BanksRemoteSource;)V", "getBanks", "Lio/reactivex/Observable;", "", "Lai/kudi/agent/core/domain/room_entities/Bank;", "locateBankByCode", "Lio/reactivex/Single;", "bankCode", "", "saveBanks", "Lio/reactivex/disposables/Disposable;", "it", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BanksRepository {
    private final BanksLocalSource banksLocalSource;
    private final BanksRemoteSource banksRemoteSource;

    public BanksRepository(BanksLocalSource banksLocalSource, BanksRemoteSource banksRemoteSource) {
        Log_OC.getArray(banksLocalSource, "banksLocalSource");
        Log_OC.getArray(banksRemoteSource, "banksRemoteSource");
        this.banksLocalSource = banksLocalSource;
        this.banksRemoteSource = banksRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final FavoritesArrayAdapter saveBanks(List list) {
        BanksLocalSource $r3 = this.banksLocalSource;
        AbstractC11688p $r4 = $r3.addBanks(list);
        Item $r5 = ClassWriter.LogError();
        AbstractC11688p $r42 = $r4.h0($r5);
        Function $r6 = Function.LEN;
        C0007c $r1 = C0007c.f33d;
        FavoritesArrayAdapter $r7 = $r42.e0($r6, $r1);
        Log_OC.loadImage($r7, "banksLocalSource.addBanks(it).subscribeOn(Schedulers.io()).subscribe(\n            {\n                Timber.d(\"banks saved\")\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: saveBanks$lambda-0  reason: not valid java name */
    public static final void m39005saveBanks$lambda0(List list) {
        Object[] $r1 = new Object[0];
        Timber.wtf("banks saved", $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p getBanks() {
        BanksRemoteSource $r4 = this.banksRemoteSource;
        BanksRepository$getBanks$1 $r1 = new BanksRepository$getBanks$1(this);
        BanksRepository$getBanks$2 $r2 = BanksRepository$getBanks$2.INSTANCE;
        $r4.fetchBanks($r1, $r2);
        BanksLocalSource $r5 = this.banksLocalSource;
        AbstractC11688p $r3 = $r5.getBanks();
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11696w locateBankByCode(String str) {
        Log_OC.getArray(str, "bankCode");
        BanksLocalSource $r2 = this.banksLocalSource;
        AbstractC11696w $r3 = $r2.findByBankCode(str);
        Item $r4 = ClassWriter.LogError();
        AbstractC11696w $r32 = $r3.u($r4);
        Item $r42 = ContextUtils.LogError();
        AbstractC11696w $r33 = $r32.n($r42);
        Log_OC.loadImage($r33, "banksLocalSource.findByBankCode(bankCode)\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return $r33;
    }
}
