package ai.kudi.agent.p036v2.productCollectionSummary.sources.remoteSources;

import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import ai.kudi.agent.p036v2.common.domain.network.client.responses.CollectionTransactionResponse;
import ai.kudi.agent.p036v2.common.domain.package_3.CollectionTransactionPaymentResponse;
import ai.kudi.agent.p036v2.common.domain.package_3.TransactionRequestBody;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import retrofit2.C14840l;
/* compiled from: CollectionTransactionRemoteSource.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/v2/productCollectionSummary/sources/remoteSources/CollectionTransactionRemoteSource;", "", "api", "Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;", "(Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;)V", "transactCollection", "Lio/reactivex/Observable;", "Lai/kudi/agent/v2/common/domain/dto/CollectionTransactionPaymentResponse;", "param", "Lai/kudi/agent/v2/common/domain/dto/TransactionRequestBody;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCollectionSummary.sources.remoteSources.CollectionTransactionRemoteSource */
/* loaded from: classes.dex */
public final class CollectionTransactionRemoteSource {
    private final MarketPlaceApi set;

    public CollectionTransactionRemoteSource(MarketPlaceApi marketPlaceApi) {
        Log_OC.getArray(marketPlaceApi, "api");
        this.set = marketPlaceApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: transactCollection$lambda-0  reason: not valid java name */
    public static final CollectionTransactionPaymentResponse m41577transactCollection$lambda0(C14840l c14840l) {
        Log_OC.getArray(c14840l, "it");
        Object $r2 = c14840l.m284a();
        CollectionTransactionResponse $r3 = (CollectionTransactionResponse) $r2;
        String $r4 = $r3 == null ? null : $r3.getCode();
        CollectionTransactionPaymentResponse $r1 = new CollectionTransactionPaymentResponse($r4, null, 2, null);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: transactCollection$lambda-2  reason: not valid java name */
    public static final CollectionTransactionPaymentResponse m41579transactCollection$lambda2(Throwable th) {
        Log_OC.getArray(th, "it");
        th.printStackTrace();
        CollectionTransactionPaymentResponse $r1 = new CollectionTransactionPaymentResponse(null, th);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC11688p transactCollection(TransactionRequestBody transactionRequestBody) {
        Log_OC.getArray(transactionRequestBody, "param");
        MarketPlaceApi $r2 = this.set;
        AbstractC11688p $r3 = $r2.makeCollectionTransaction(transactionRequestBody);
        C0705c $r4 = C0705c.f1931d;
        AbstractC11688p $r32 = $r3.m10531O($r4);
        Pair $r5 = Pair.f1929b;
        AbstractC11688p $r33 = $r32.x($r5);
        C0704b $r6 = C0704b.f1930e;
        AbstractC11688p $r34 = $r33.m10526T($r6);
        Log_OC.loadImage($r34, "api.makeCollectionTransaction(param).map {\n            CollectionTransactionPaymentResponse(it.body()?.code)\n        }.doOnError {\n            throwAppropriateException()\n        }.onErrorReturn {\n            it.printStackTrace()\n            CollectionTransactionPaymentResponse(null, it)\n        }");
        return $r34;
    }
}
