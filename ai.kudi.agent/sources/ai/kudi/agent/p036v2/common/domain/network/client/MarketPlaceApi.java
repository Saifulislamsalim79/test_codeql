package ai.kudi.agent.p036v2.common.domain.network.client;

import ai.kudi.agent.p036v2.common.domain.package_3.LookupCustomerRequestBody;
import ai.kudi.agent.p036v2.common.domain.package_3.RegistrationRequestBody;
import ai.kudi.agent.p036v2.common.domain.package_3.TransactionRequestBody;
import ai.kudi.agent.p036v2.common.domain.package_3.VerificationRequestBody;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import kotlin.Metadata;
import p425j.p444e.AbstractC11688p;
/* compiled from: MarketPlaceApi.kt */
@Metadata(m10422d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001Ja\u0010\u0002\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u00050\u00040\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\nH'¢\u0006\u0002\u0010\u0010J0\u0010\u0011\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00070\u00120\u00050\u00040\u00032\b\b\u0001\u0010\u0014\u001a\u00020\nH'J&\u0010\u0015\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00160\u00050\u00040\u0003H'J$\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\u00040\u00032\b\b\u0001\u0010\u0014\u001a\u00020\nH'J \u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00070\u00050\u00040\u0003H'J \u0010\u001b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00050\u00040\u0003H'J$\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\u00040\u00032\b\b\u0001\u0010\u001e\u001a\u00020\u001fH'J$\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0\u00040\u00032\b\b\u0001\u0010#\u001a\u00020$H'J$\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00050\u00040\u00032\b\b\u0001\u0010'\u001a\u00020(H'J$\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00050\u00040\u00032\b\b\u0001\u0010'\u001a\u00020*H'¨\u0006+"}, m10421d2 = {"Lai/kudi/agent/v2/common/domain/network/client/MarketPlaceApi;", "", "getAllProducts", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "Lai/kudi/agent/core/network/response/APIResponse;", "Lai/kudi/agent/v2/common/domain/network/client/responses/APIResponseList;", "", "Lai/kudi/agent/core/domain/data/MarketplaceProductModel;", "searchTerm", "", "businessCategoryId", "", "size", "page", TransactionField.STATUS, "(Ljava/lang/String;Ljava/lang/Integer;IILjava/lang/String;)Lio/reactivex/Observable;", "getAssociatedFields", "Lai/kudi/agent/v2/common/domain/dto/AssociatedFieldResponse;", "Lai/kudi/dip/library/bottomSheets/models/Field;", "productId", "getBestCommission", "Lai/kudi/agent/v2/common/domain/network/client/responses/BestCommissionResponse;", "getProductFields", "Lai/kudi/agent/core/domain/data/ProductField;", "getProductSectors", "Lai/kudi/agent/core/domain/data/ProductSectorModel;", "getTopPicks", "lookupCustomer", "Lai/kudi/agent/v2/common/domain/dto/LookupCustomerResponse;", "lookupRequest", "Lai/kudi/agent/v2/common/domain/dto/LookupCustomerRequestBody;", "makeCollectionTransaction", "Lai/kudi/agent/v2/common/domain/network/client/responses/CollectionTransactionResponse;", "Lai/kudi/agent/v2/common/domain/dto/TransactionResponseBody;", "collectionPaymentDto", "Lai/kudi/agent/v2/common/domain/dto/TransactionRequestBody;", "registerCustomer", "Lai/kudi/agent/v2/common/domain/dto/RegistrationResponseBody;", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/v2/common/domain/dto/RegistrationRequestBody;", "verifyRegistration", "Lai/kudi/agent/v2/common/domain/dto/VerificationRequestBody;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.domain.network.client.MarketPlaceApi */
/* loaded from: classes.dex */
public interface MarketPlaceApi {
    AbstractC11688p getAllProducts(String str, Integer num, int i, int i2, String str2);

    AbstractC11688p getAssociatedFields(String str);

    AbstractC11688p getBestCommission();

    AbstractC11688p getProductFields(String str);

    AbstractC11688p getProductSectors();

    AbstractC11688p getTopPicks();

    AbstractC11688p lookupCustomer(LookupCustomerRequestBody lookupCustomerRequestBody);

    AbstractC11688p makeCollectionTransaction(TransactionRequestBody transactionRequestBody);

    AbstractC11688p registerCustomer(RegistrationRequestBody registrationRequestBody);

    AbstractC11688p verifyRegistration(VerificationRequestBody verificationRequestBody);
}
