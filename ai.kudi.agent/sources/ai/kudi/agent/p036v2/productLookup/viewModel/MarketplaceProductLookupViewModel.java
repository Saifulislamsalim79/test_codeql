package ai.kudi.agent.p036v2.productLookup.viewModel;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.core.domain.data.ProductField;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.merchantProduct.data.CustomerLookupRequest;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.p036v2.common.domain.package_3.AssociatedFieldsResponseBody;
import ai.kudi.agent.p036v2.common.domain.package_3.LookupCustomerResponse;
import ai.kudi.agent.p036v2.common.domain.package_3.ProductFieldResponse;
import ai.kudi.agent.p036v2.common.domain.usecases.AssociatedField;
import ai.kudi.agent.p036v2.common.domain.usecases.FileUpload;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.p036v2.productDetails.domain.usecases.ProductFieldsUseCase;
import ai.kudi.agent.p036v2.productLookup.useCases.LookupCustomerUseCase;
import ai.kudi.agent.p036v2.productLookup.viewData.MarketplaceProductLookupViewData;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import ai.kudi.dip.library.bottomSheets.models.Field;
import ai.kudi.mediaservice.marketplaceCollection.response.FileUploadResponse;
import ai.kudi.mediaservice.marketplaceCollection.response.UploadResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13727r0;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: MarketplaceProductLookupViewModel.kt */
@Metadata(m10422d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u0007\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0014J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0014J\b\u0010 \u001a\u00020\u0002H\u0016J2\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00170\u00132\u0006\u0010&\u001a\u00020\u0014J\u0016\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m10421d2 = {"Lai/kudi/agent/v2/productLookup/viewModel/MarketplaceProductLookupViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/v2/productLookup/viewData/MarketplaceProductLookupViewData;", "fetchProductFields", "Lai/kudi/agent/v2/productDetails/domain/usecases/ProductFieldsUseCase;", "fileUpload", "Lai/kudi/agent/v2/common/domain/usecases/FileUpload;", "fetchLocation", "Lai/kudi/agent/register/domain/usecases/FetchLocation;", "lookupCustomerUseCase", "Lai/kudi/agent/v2/productLookup/useCases/LookupCustomerUseCase;", "analytics", "Lai/kudi/agent/core/analytics/Analytics;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "fetchAssociatedField", "Lai/kudi/agent/v2/common/domain/usecases/AssociatedField;", "(Lai/kudi/agent/v2/productDetails/domain/usecases/ProductFieldsUseCase;Lai/kudi/agent/v2/common/domain/usecases/FileUpload;Lai/kudi/agent/register/domain/usecases/FetchLocation;Lai/kudi/agent/v2/productLookup/useCases/LookupCustomerUseCase;Lai/kudi/agent/core/analytics/Analytics;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/v2/common/domain/usecases/AssociatedField;)V", "mapOfFileProperties", "", "", "totalLookupDetails", "", "", "collectionEvent", "", TransactionField.STATUS, "", "getAssociatedField", "id", "getProductFields", "productId", "initialData", "lookupCustomer", "longitude", "", "latitude", "propertiesMap", "productCode", "uploadFile", "filePath", "field", "Lai/kudi/dip/library/bottomSheets/models/Field;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productLookup.viewModel.MarketplaceProductLookupViewModel */
/* loaded from: classes.dex */
public final class MarketplaceProductLookupViewModel extends BaseViewModel<MarketplaceProductLookupViewData> {
    private final Analytics analytics;
    private final AssociatedField fetchAssociatedField;
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchLocation fetchLocation;
    private final ProductFieldsUseCase fetchProductFields;
    private final FileUpload fileUpload;
    private final LookupCustomerUseCase lookupCustomerUseCase;
    private Map<String, String> mapOfFileProperties;
    private Map<String, Object> totalLookupDetails;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public MarketplaceProductLookupViewModel(ProductFieldsUseCase productFieldsUseCase, FileUpload fileUpload, FetchLocation fetchLocation, LookupCustomerUseCase lookupCustomerUseCase, Analytics analytics, FetchCurrentUser fetchCurrentUser, AssociatedField associatedField) {
        Map $r7;
        Log_OC.getArray(productFieldsUseCase, "fetchProductFields");
        Log_OC.getArray(fileUpload, "fileUpload");
        Log_OC.getArray(fetchLocation, "fetchLocation");
        Log_OC.getArray(lookupCustomerUseCase, "lookupCustomerUseCase");
        Log_OC.getArray(analytics, "analytics");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(associatedField, "fetchAssociatedField");
        this.fetchProductFields = productFieldsUseCase;
        this.fileUpload = fileUpload;
        this.fetchLocation = fetchLocation;
        this.lookupCustomerUseCase = lookupCustomerUseCase;
        this.analytics = analytics;
        this.fetchCurrentUser = fetchCurrentUser;
        this.fetchAssociatedField = associatedField;
        LinkedHashMap $r9 = new LinkedHashMap();
        this.totalLookupDetails = $r9;
        $r7 = C13727r0.m3881k();
        this.mapOfFileProperties = $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: collectionEvent$lambda-12  reason: not valid java name */
    public static final void m41664collectionEvent$lambda12(MarketplaceProductLookupViewModel marketplaceProductLookupViewModel, boolean z, User user) {
        Log_OC.getArray(marketplaceProductLookupViewModel, "this$0");
        Analytics $r3 = marketplaceProductLookupViewModel.analytics;
        String $r0 = user.getPhoneNumber();
        Log_OC.loadImage($r0, "it.phoneNumber");
        $r3.proceedToCollectionClicked($r0, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchLocation$lambda-3  reason: not valid java name */
    public static final void m41666fetchLocation$lambda3(MarketplaceProductLookupViewModel marketplaceProductLookupViewModel, List list) {
        Log_OC.getArray(marketplaceProductLookupViewModel, "this$0");
        ViewData $r2 = marketplaceProductLookupViewModel.getState();
        Log_OC.loadImage(list, "it");
        MarketplaceProductLookupViewData $r3 = MarketplaceProductLookupViewData.copy$default((MarketplaceProductLookupViewData) $r2, null, null, null, null, false, false, null, null, false, false, list, null, null, false, null, 31487, null);
        marketplaceProductLookupViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchLocation$lambda-4  reason: not valid java name */
    public static final void m41667fetchLocation$lambda4(MarketplaceProductLookupViewModel marketplaceProductLookupViewModel, Throwable th) {
        Log_OC.getArray(marketplaceProductLookupViewModel, "this$0");
        ViewData $r2 = marketplaceProductLookupViewModel.getState();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Error loading product Lists", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        Error $r4 = new Error((String) $r6, false, 2, null);
        MarketplaceProductLookupViewData $r3 = MarketplaceProductLookupViewData.copy$default((MarketplaceProductLookupViewData) $r2, null, null, null, null, false, false, null, null, false, false, null, $r4, null, false, null, 30719, null);
        marketplaceProductLookupViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getAssociatedField$lambda-10  reason: not valid java name */
    public static final void m41668getAssociatedField$lambda10(MarketplaceProductLookupViewModel marketplaceProductLookupViewModel, AssociatedFieldsResponseBody associatedFieldsResponseBody) {
        Log_OC.getArray(marketplaceProductLookupViewModel, "this$0");
        String $r2 = associatedFieldsResponseBody.getResponseMessage();
        if ($r2 != null) {
            ViewData $r3 = marketplaceProductLookupViewModel.getState();
            String $r22 = associatedFieldsResponseBody.getResponseMessage();
            Error $r5 = new Error($r22, false, 2, null);
            MarketplaceProductLookupViewData $r4 = MarketplaceProductLookupViewData.copy$default((MarketplaceProductLookupViewData) $r3, null, null, null, null, false, false, null, null, false, false, null, null, null, false, $r5, 8191, null);
            marketplaceProductLookupViewModel.publish($r4);
        }
        List $r6 = associatedFieldsResponseBody.getProductFields();
        if ($r6 != null) {
            List $r62 = associatedFieldsResponseBody.getProductFields();
            ViewData $r32 = marketplaceProductLookupViewModel.getState();
            MarketplaceProductLookupViewData $r42 = (MarketplaceProductLookupViewData) $r32;
            marketplaceProductLookupViewModel.publish(MarketplaceProductLookupViewData.copy$default($r42, null, null, null, null, false, false, null, null, false, false, null, null, $r62, false, null, 20479, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getAssociatedField$lambda-11  reason: not valid java name */
    public static final void m41669getAssociatedField$lambda11(MarketplaceProductLookupViewModel marketplaceProductLookupViewModel, Throwable th) {
        Log_OC.getArray(marketplaceProductLookupViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default("Error fetching associated fields", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        Error $r2 = new Error((String) $r4, false, 2, null);
        ViewData $r6 = marketplaceProductLookupViewModel.getState();
        MarketplaceProductLookupViewData $r7 = MarketplaceProductLookupViewData.copy$default((MarketplaceProductLookupViewData) $r6, null, $r2, null, null, false, false, null, null, false, false, null, null, null, false, null, 24573, null);
        marketplaceProductLookupViewModel.publish($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getProductFields$lambda-0  reason: not valid java name */
    public static final void m41670getProductFields$lambda0(MarketplaceProductLookupViewModel marketplaceProductLookupViewModel, ProductFieldResponse productFieldResponse) {
        Log_OC.getArray(marketplaceProductLookupViewModel, "this$0");
        ProductField $r2 = productFieldResponse == null ? null : productFieldResponse.getProductField();
        if ($r2 != null) {
            ViewData $r3 = marketplaceProductLookupViewModel.getState();
            ProductField $r22 = productFieldResponse.getProductField();
            MarketplaceProductLookupViewData $r4 = MarketplaceProductLookupViewData.copy$default((MarketplaceProductLookupViewData) $r3, $r22, null, null, null, false, false, null, null, false, false, null, null, null, false, null, 32734, null);
            marketplaceProductLookupViewModel.publish($r4);
        }
        String $r5 = productFieldResponse == null ? null : productFieldResponse.getResponseMessage();
        if ($r5 != null) {
            ViewData $r32 = marketplaceProductLookupViewModel.getState();
            MarketplaceProductLookupViewData $r42 = (MarketplaceProductLookupViewData) $r32;
            String $r52 = productFieldResponse.getResponseMessage();
            Error $r6 = new Error($r52, false, 2, null);
            marketplaceProductLookupViewModel.publish(MarketplaceProductLookupViewData.copy$default($r42, null, $r6, null, null, false, false, null, null, false, false, null, null, null, false, null, 32733, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getProductFields$lambda-1  reason: not valid java name */
    public static final void m41671getProductFields$lambda1(MarketplaceProductLookupViewModel marketplaceProductLookupViewModel, Throwable th) {
        Log_OC.getArray(marketplaceProductLookupViewModel, "this$0");
        ViewData $r2 = marketplaceProductLookupViewModel.getState();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Error loading product Lists", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        Error $r4 = new Error((String) $r6, false, 2, null);
        MarketplaceProductLookupViewData $r3 = MarketplaceProductLookupViewData.copy$default((MarketplaceProductLookupViewData) $r2, null, $r4, null, null, false, false, null, null, false, false, null, null, null, false, null, 32765, null);
        marketplaceProductLookupViewModel.publish($r3);
        ViewData $r22 = marketplaceProductLookupViewModel.getState();
        MarketplaceProductLookupViewData $r32 = (MarketplaceProductLookupViewData) $r22;
        marketplaceProductLookupViewModel.publish(MarketplaceProductLookupViewData.copy$default($r32, null, null, null, null, false, false, null, null, false, false, null, null, null, false, null, 32735, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: lookupCustomer$lambda-7  reason: not valid java name */
    public static final InterfaceC11692s m41672lookupCustomer$lambda7(MarketplaceProductLookupViewModel marketplaceProductLookupViewModel, double d, double d2, String str, User user) {
        Log_OC.getArray(marketplaceProductLookupViewModel, "this$0");
        Log_OC.getArray(str, "$productCode");
        Log_OC.getArray(user, "it");
        LookupCustomerUseCase $r5 = marketplaceProductLookupViewModel.lookupCustomerUseCase;
        String $r6 = user.getId();
        Log_OC.loadImage($r6, "it.id");
        Map $r3 = marketplaceProductLookupViewModel.totalLookupDetails;
        CustomerLookupRequest $r4 = new CustomerLookupRequest($r6, d, d2, str, $r3);
        AbstractC11688p $r7 = $r5.execute($r4);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: lookupCustomer$lambda-8  reason: not valid java name */
    public static final void m41673lookupCustomer$lambda8(MarketplaceProductLookupViewModel marketplaceProductLookupViewModel, LookupCustomerResponse lookupCustomerResponse) {
        Log_OC.getArray(marketplaceProductLookupViewModel, "this$0");
        ViewData $r2 = marketplaceProductLookupViewModel.getState();
        Map $r4 = lookupCustomerResponse.getSummary();
        String $r5 = lookupCustomerResponse.getMessage();
        MarketplaceProductLookupViewData $r3 = MarketplaceProductLookupViewData.copy$default((MarketplaceProductLookupViewData) $r2, null, null, null, null, false, false, $r4, $r5, false, false, null, null, null, false, null, 32559, null);
        marketplaceProductLookupViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: lookupCustomer$lambda-9  reason: not valid java name */
    public static final void m41674lookupCustomer$lambda9(MarketplaceProductLookupViewModel marketplaceProductLookupViewModel, Throwable th) {
        Log_OC.getArray(marketplaceProductLookupViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default("Error looking up customer", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        Error $r2 = new Error((String) $r4, false, 2, null);
        ViewData $r6 = marketplaceProductLookupViewModel.getState();
        MarketplaceProductLookupViewData $r7 = MarketplaceProductLookupViewData.copy$default((MarketplaceProductLookupViewData) $r6, null, $r2, null, null, false, false, null, null, false, false, null, null, null, false, null, 32749, null);
        marketplaceProductLookupViewModel.publish($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: uploadFile$lambda-5  reason: not valid java name */
    public static final void m41675uploadFile$lambda5(Map map, Field field, MarketplaceProductLookupViewModel marketplaceProductLookupViewModel, UploadResponse uploadResponse) {
        Log_OC.getArray(map, "$filePropMap");
        Log_OC.getArray(field, "$field");
        Log_OC.getArray(marketplaceProductLookupViewModel, "this$0");
        FileUploadResponse $r4 = uploadResponse.getFileUploadResponse();
        String $r6 = $r4 == null ? null : $r4.getId();
        if ($r6 == null) {
            ViewData $r8 = marketplaceProductLookupViewModel.getState();
            MarketplaceProductLookupViewData $r9 = (MarketplaceProductLookupViewData) $r8;
            String $r5 = uploadResponse.getErrorResponseMessage();
            String $r62 = $r5;
            if ($r5 == null) {
                $r62 = "Error uploading file";
            }
            Error $r10 = new Error($r62, false, 2, null);
            marketplaceProductLookupViewModel.publish(MarketplaceProductLookupViewData.copy$default($r9, null, null, $r10, null, false, false, null, null, false, false, null, null, null, false, null, 32251, null));
            return;
        }
        String $r63 = field.getKey();
        FileUploadResponse $r42 = uploadResponse.getFileUploadResponse();
        String $r52 = $r42 != null ? $r42.getId() : null;
        Log_OC.append($r52);
        map.put($r63, $r52);
        Map $r7 = marketplaceProductLookupViewModel.totalLookupDetails;
        $r7.putAll(map);
        ViewData $r82 = marketplaceProductLookupViewModel.getState();
        MarketplaceProductLookupViewData $r92 = MarketplaceProductLookupViewData.copy$default((MarketplaceProductLookupViewData) $r82, null, null, null, map, false, false, null, null, false, false, null, null, null, false, null, 32247, null);
        marketplaceProductLookupViewModel.publish($r92);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: uploadFile$lambda-6  reason: not valid java name */
    public static final void m41676uploadFile$lambda6(MarketplaceProductLookupViewModel marketplaceProductLookupViewModel, Throwable th) {
        Log_OC.getArray(marketplaceProductLookupViewModel, "this$0");
        ViewData $r2 = marketplaceProductLookupViewModel.getState();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Error uploading files", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        Error $r4 = new Error((String) $r6, false, 2, null);
        MarketplaceProductLookupViewData $r3 = MarketplaceProductLookupViewData.copy$default((MarketplaceProductLookupViewData) $r2, null, null, $r4, null, false, false, null, null, false, false, null, null, null, false, null, 32251, null);
        marketplaceProductLookupViewModel.publish($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void collectionEvent(final boolean z) {
        FetchCurrentUser $r1 = this.fetchCurrentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        Object object = new Object() { // from class: ai.kudi.agent.v2.productLookup.viewModel.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceProductLookupViewModel $r12 = MarketplaceProductLookupViewModel.this;
                boolean $z0 = z;
                User $r3 = (User) obj;
                MarketplaceProductLookupViewModel.m41664collectionEvent$lambda12($r12, $z0, $r3);
            }
        };
        Token $r4 = Token.FUNCTION;
        FavoritesArrayAdapter $r5 = $r2.s(object, $r4);
        Log_OC.loadImage($r5, "fetchCurrentUser.execute().subscribe(\n            {\n                analytics.proceedToCollectionClicked(it.phoneNumber, status)\n            },\n            {\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        $r6.b($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchLocation() {
        ViewData $r1 = getState();
        MarketplaceProductLookupViewData $r2 = MarketplaceProductLookupViewData.copy$default((MarketplaceProductLookupViewData) $r1, null, null, null, null, false, false, null, null, true, false, null, null, null, false, null, 32511, null);
        publish($r2);
        FetchLocation $r3 = this.fetchLocation;
        AbstractC11688p $r4 = $r3.execute();
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.v2.productLookup.viewModel.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceProductLookupViewModel $r12 = MarketplaceProductLookupViewModel.this;
                List $r32 = (List) obj;
                MarketplaceProductLookupViewModel.m41666fetchLocation$lambda3($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productLookup.viewModel.FileFilterUtil$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceProductLookupViewModel $r12 = MarketplaceProductLookupViewModel.this;
                Throwable $r32 = (Throwable) obj;
                MarketplaceProductLookupViewModel.m41667fetchLocation$lambda4($r12, $r32);
            }
        });
        C11280b $r8 = getCompositeDisposable();
        $r8.b($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getAssociatedField(String str) {
        Log_OC.getArray(str, "id");
        ViewData $r2 = getState();
        MarketplaceProductLookupViewData $r3 = MarketplaceProductLookupViewData.copy$default((MarketplaceProductLookupViewData) $r2, null, null, null, null, false, false, null, null, false, false, null, null, null, true, null, 24575, null);
        publish($r3);
        AssociatedField $r4 = this.fetchAssociatedField;
        AbstractC11688p $r5 = $r4.execute(str);
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.v2.productLookup.viewModel.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceProductLookupViewModel $r1 = MarketplaceProductLookupViewModel.this;
                AssociatedFieldsResponseBody $r32 = (AssociatedFieldsResponseBody) obj;
                MarketplaceProductLookupViewModel.m41668getAssociatedField$lambda10($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productLookup.viewModel.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceProductLookupViewModel $r1 = MarketplaceProductLookupViewModel.this;
                Throwable $r32 = (Throwable) obj;
                MarketplaceProductLookupViewModel.m41669getAssociatedField$lambda11($r1, $r32);
            }
        });
        C11280b $r9 = getCompositeDisposable();
        $r9.b($r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void getProductFields(String str) {
        Log_OC.getArray(str, "productId");
        ViewData $r2 = getState();
        MarketplaceProductLookupViewData $r3 = MarketplaceProductLookupViewData.copy$default((MarketplaceProductLookupViewData) $r2, null, null, null, null, false, true, null, null, false, false, null, null, null, false, null, 32735, null);
        publish($r3);
        ProductFieldsUseCase $r4 = this.fetchProductFields;
        AbstractC11688p $r5 = $r4.execute(str);
        FavoritesArrayAdapter $r6 = $r5 == null ? null : $r5.e0(new Object() { // from class: ai.kudi.agent.v2.productLookup.viewModel.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceProductLookupViewModel $r1 = MarketplaceProductLookupViewModel.this;
                ProductFieldResponse $r32 = (ProductFieldResponse) obj;
                MarketplaceProductLookupViewModel.m41670getProductFields$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productLookup.viewModel.SubjectSubscriptionManager$SubjectObserver
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceProductLookupViewModel $r1 = MarketplaceProductLookupViewModel.this;
                Throwable $r32 = (Throwable) obj;
                MarketplaceProductLookupViewModel.m41671getProductFields$lambda1($r1, $r32);
            }
        });
        if ($r6 == null) {
            return;
        }
        C11280b $r9 = getCompositeDisposable();
        $r9.b($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        MarketplaceProductLookupViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public MarketplaceProductLookupViewData initialData() {
        MarketplaceProductLookupViewData $r1 = new MarketplaceProductLookupViewData(null, null, null, null, false, false, null, null, false, false, null, null, null, false, null, 32767, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void lookupCustomer(final double d, final double d2, Map map, final String str) {
        Log_OC.getArray(map, "propertiesMap");
        Log_OC.getArray(str, "productCode");
        Map $r3 = this.mapOfFileProperties;
        boolean $z0 = $r3.isEmpty();
        if (!$z0) {
            Map $r32 = this.totalLookupDetails;
            Map $r4 = this.mapOfFileProperties;
            $r32.putAll($r4);
        }
        Map $r33 = this.totalLookupDetails;
        $r33.putAll(map);
        ViewData $r5 = getState();
        MarketplaceProductLookupViewData $r6 = MarketplaceProductLookupViewData.copy$default((MarketplaceProductLookupViewData) $r5, null, null, null, null, true, false, null, null, false, false, null, null, null, false, null, 32751, null);
        publish($r6);
        FetchCurrentUser $r7 = this.fetchCurrentUser;
        AbstractC11696w $r8 = FetchCurrentUser.execute$default($r7, null, null, 3, null);
        AbstractC11688p $r10 = $r8.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.v2.productLookup.viewModel.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                MarketplaceProductLookupViewModel $r1 = MarketplaceProductLookupViewModel.this;
                double $d0 = d2;
                double $d1 = d;
                String $r2 = str;
                User $r52 = (User) obj;
                InterfaceC11692s $r34 = MarketplaceProductLookupViewModel.m41672lookupCustomer$lambda7($r1, $d0, $d1, $r2, $r52);
                return $r34;
            }
        });
        FavoritesArrayAdapter $r13 = $r10.e0(new Object() { // from class: ai.kudi.agent.v2.productLookup.viewModel.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceProductLookupViewModel $r1 = MarketplaceProductLookupViewModel.this;
                LookupCustomerResponse $r34 = (LookupCustomerResponse) obj;
                MarketplaceProductLookupViewModel.m41673lookupCustomer$lambda8($r1, $r34);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productLookup.viewModel.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceProductLookupViewModel $r1 = MarketplaceProductLookupViewModel.this;
                Throwable $r34 = (Throwable) obj;
                MarketplaceProductLookupViewModel.m41674lookupCustomer$lambda9($r1, $r34);
            }
        });
        C11280b $r14 = getCompositeDisposable();
        $r14.b($r13);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void uploadFile(String str, final Field field) {
        Log_OC.getArray(str, "filePath");
        Log_OC.getArray(field, "field");
        final LinkedHashMap $r3 = new LinkedHashMap();
        ViewData $r4 = getState();
        MarketplaceProductLookupViewData $r5 = MarketplaceProductLookupViewData.copy$default((MarketplaceProductLookupViewData) $r4, null, null, null, null, false, false, null, null, false, true, null, null, null, false, null, 32255, null);
        publish($r5);
        FileUpload $r6 = this.fileUpload;
        AbstractC11688p $r7 = $r6.execute(str);
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.v2.productLookup.viewModel.FlingerListView$ItemFlingerResponder
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                Map $r1 = $r3;
                Field $r2 = field;
                MarketplaceProductLookupViewModel $r32 = this;
                UploadResponse $r52 = (UploadResponse) obj;
                MarketplaceProductLookupViewModel.m41675uploadFile$lambda5($r1, $r2, $r32, $r52);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productLookup.viewModel.Socks5BytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceProductLookupViewModel $r1 = MarketplaceProductLookupViewModel.this;
                Throwable $r32 = (Throwable) obj;
                MarketplaceProductLookupViewModel.m41676uploadFile$lambda6($r1, $r32);
            }
        });
        C11280b $r11 = getCompositeDisposable();
        $r11.b($r10);
    }
}
