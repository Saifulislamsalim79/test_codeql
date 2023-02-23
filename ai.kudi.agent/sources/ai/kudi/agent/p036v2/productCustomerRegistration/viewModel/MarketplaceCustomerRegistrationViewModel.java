package ai.kudi.agent.p036v2.productCustomerRegistration.viewModel;

import ai.kudi.agent.core.domain.data.ProductField;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.p036v2.common.domain.package_3.AssociatedFieldsResponseBody;
import ai.kudi.agent.p036v2.common.domain.package_3.ProductFieldResponse;
import ai.kudi.agent.p036v2.common.domain.usecases.AssociatedField;
import ai.kudi.agent.p036v2.common.domain.usecases.FileUpload;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.p036v2.productCustomerRegistration.viewData.MarketplaceCustomerRegistrationViewData;
import ai.kudi.agent.p036v2.productDetails.domain.usecases.ProductFieldsUseCase;
import ai.kudi.agent.register.domain.usecases.FetchLocation;
import ai.kudi.dip.library.bottomSheets.models.Field;
import ai.kudi.mediaservice.marketplaceCollection.response.FileUploadResponse;
import ai.kudi.mediaservice.marketplaceCollection.response.UploadResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: MarketplaceCustomerRegistrationViewModel.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0005\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0016\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/v2/productCustomerRegistration/viewModel/MarketplaceCustomerRegistrationViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/v2/productCustomerRegistration/viewData/MarketplaceCustomerRegistrationViewData;", "fetchProductFields", "Lai/kudi/agent/v2/productDetails/domain/usecases/ProductFieldsUseCase;", "fetchLocation", "Lai/kudi/agent/register/domain/usecases/FetchLocation;", "fileUpload", "Lai/kudi/agent/v2/common/domain/usecases/FileUpload;", "fetchAssociatedField", "Lai/kudi/agent/v2/common/domain/usecases/AssociatedField;", "(Lai/kudi/agent/v2/productDetails/domain/usecases/ProductFieldsUseCase;Lai/kudi/agent/register/domain/usecases/FetchLocation;Lai/kudi/agent/v2/common/domain/usecases/FileUpload;Lai/kudi/agent/v2/common/domain/usecases/AssociatedField;)V", "", "getAssociatedField", "id", "", "getProductFields", "productId", "initialData", "uploadFile", "filePath", "field", "Lai/kudi/dip/library/bottomSheets/models/Field;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCustomerRegistration.viewModel.MarketplaceCustomerRegistrationViewModel */
/* loaded from: classes.dex */
public final class MarketplaceCustomerRegistrationViewModel extends BaseViewModel<MarketplaceCustomerRegistrationViewData> {
    private final AssociatedField fetchAssociatedField;
    private final FetchLocation fetchLocation;
    private final ProductFieldsUseCase fetchProductFields;
    private final FileUpload fileUpload;

    public MarketplaceCustomerRegistrationViewModel(ProductFieldsUseCase productFieldsUseCase, FetchLocation fetchLocation, FileUpload fileUpload, AssociatedField associatedField) {
        Log_OC.getArray(productFieldsUseCase, "fetchProductFields");
        Log_OC.getArray(fetchLocation, "fetchLocation");
        Log_OC.getArray(fileUpload, "fileUpload");
        Log_OC.getArray(associatedField, "fetchAssociatedField");
        this.fetchProductFields = productFieldsUseCase;
        this.fetchLocation = fetchLocation;
        this.fileUpload = fileUpload;
        this.fetchAssociatedField = associatedField;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchLocation$lambda-5  reason: not valid java name */
    public static final void m41590fetchLocation$lambda5(MarketplaceCustomerRegistrationViewModel marketplaceCustomerRegistrationViewModel, List list) {
        Log_OC.getArray(marketplaceCustomerRegistrationViewModel, "this$0");
        ViewData $r2 = marketplaceCustomerRegistrationViewModel.getState();
        Log_OC.loadImage(list, "it");
        MarketplaceCustomerRegistrationViewData $r3 = MarketplaceCustomerRegistrationViewData.copy$default((MarketplaceCustomerRegistrationViewData) $r2, null, null, false, false, list, null, false, null, null, null, false, null, 4071, null);
        marketplaceCustomerRegistrationViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchLocation$lambda-6  reason: not valid java name */
    public static final void m41591fetchLocation$lambda6(MarketplaceCustomerRegistrationViewModel marketplaceCustomerRegistrationViewModel, Throwable th) {
        Log_OC.getArray(marketplaceCustomerRegistrationViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default("Error fetching states and LGAs", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        Error $r2 = new Error((String) $r4, false, 2, null);
        ViewData $r6 = marketplaceCustomerRegistrationViewModel.getState();
        MarketplaceCustomerRegistrationViewData $r7 = MarketplaceCustomerRegistrationViewData.copy$default((MarketplaceCustomerRegistrationViewData) $r6, null, null, false, false, null, $r2, false, null, null, null, false, null, 4055, null);
        marketplaceCustomerRegistrationViewModel.publish($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getAssociatedField$lambda-7  reason: not valid java name */
    public static final void m41592getAssociatedField$lambda7(MarketplaceCustomerRegistrationViewModel marketplaceCustomerRegistrationViewModel, AssociatedFieldsResponseBody associatedFieldsResponseBody) {
        Log_OC.getArray(marketplaceCustomerRegistrationViewModel, "this$0");
        String $r2 = associatedFieldsResponseBody.getResponseMessage();
        if ($r2 != null) {
            ViewData $r3 = marketplaceCustomerRegistrationViewModel.getState();
            String $r22 = associatedFieldsResponseBody.getResponseMessage();
            Error $r5 = new Error($r22, false, 2, null);
            MarketplaceCustomerRegistrationViewData $r4 = MarketplaceCustomerRegistrationViewData.copy$default((MarketplaceCustomerRegistrationViewData) $r3, null, null, false, false, null, null, false, null, null, null, false, $r5, 1023, null);
            marketplaceCustomerRegistrationViewModel.publish($r4);
        }
        List $r6 = associatedFieldsResponseBody.getProductFields();
        if ($r6 != null) {
            List $r62 = associatedFieldsResponseBody.getProductFields();
            ViewData $r32 = marketplaceCustomerRegistrationViewModel.getState();
            MarketplaceCustomerRegistrationViewData $r42 = (MarketplaceCustomerRegistrationViewData) $r32;
            marketplaceCustomerRegistrationViewModel.publish(MarketplaceCustomerRegistrationViewData.copy$default($r42, null, null, false, false, null, null, false, null, null, $r62, false, null, 2559, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getAssociatedField$lambda-8  reason: not valid java name */
    public static final void m41593getAssociatedField$lambda8(MarketplaceCustomerRegistrationViewModel marketplaceCustomerRegistrationViewModel, Throwable th) {
        Log_OC.getArray(marketplaceCustomerRegistrationViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default("Error fetching associated fields", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        Error $r2 = new Error((String) $r4, false, 2, null);
        ViewData $r6 = marketplaceCustomerRegistrationViewModel.getState();
        MarketplaceCustomerRegistrationViewData $r7 = MarketplaceCustomerRegistrationViewData.copy$default((MarketplaceCustomerRegistrationViewData) $r6, null, $r2, false, false, null, null, false, null, null, null, false, null, 3069, null);
        marketplaceCustomerRegistrationViewModel.publish($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getProductFields$lambda-0  reason: not valid java name */
    public static final void m41594getProductFields$lambda0(MarketplaceCustomerRegistrationViewModel marketplaceCustomerRegistrationViewModel, ProductFieldResponse productFieldResponse) {
        Log_OC.getArray(marketplaceCustomerRegistrationViewModel, "this$0");
        ProductField $r2 = productFieldResponse == null ? null : productFieldResponse.getProductField();
        if ($r2 != null) {
            ViewData $r3 = marketplaceCustomerRegistrationViewModel.getState();
            ProductField $r22 = productFieldResponse.getProductField();
            MarketplaceCustomerRegistrationViewData $r4 = MarketplaceCustomerRegistrationViewData.copy$default((MarketplaceCustomerRegistrationViewData) $r3, $r22, null, false, false, null, null, false, null, null, null, false, null, 4090, null);
            marketplaceCustomerRegistrationViewModel.publish($r4);
        }
        String $r5 = productFieldResponse == null ? null : productFieldResponse.getResponseMessage();
        if ($r5 != null) {
            String $r52 = productFieldResponse.getResponseMessage();
            Error $r6 = new Error($r52, false, 2, null);
            ViewData $r32 = marketplaceCustomerRegistrationViewModel.getState();
            MarketplaceCustomerRegistrationViewData $r42 = (MarketplaceCustomerRegistrationViewData) $r32;
            marketplaceCustomerRegistrationViewModel.publish(MarketplaceCustomerRegistrationViewData.copy$default($r42, null, $r6, false, false, null, null, false, null, null, null, false, null, 4089, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getProductFields$lambda-1  reason: not valid java name */
    public static final void m41595getProductFields$lambda1(MarketplaceCustomerRegistrationViewModel marketplaceCustomerRegistrationViewModel, Throwable th) {
        Log_OC.getArray(marketplaceCustomerRegistrationViewModel, "this$0");
        ViewData $r2 = marketplaceCustomerRegistrationViewModel.getState();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Error loading product Fields", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        Error $r4 = new Error((String) $r6, false, 2, null);
        MarketplaceCustomerRegistrationViewData $r3 = MarketplaceCustomerRegistrationViewData.copy$default((MarketplaceCustomerRegistrationViewData) $r2, null, $r4, false, false, null, null, false, null, null, null, false, null, 4093, null);
        marketplaceCustomerRegistrationViewModel.publish($r3);
        ViewData $r22 = marketplaceCustomerRegistrationViewModel.getState();
        MarketplaceCustomerRegistrationViewData $r32 = (MarketplaceCustomerRegistrationViewData) $r22;
        marketplaceCustomerRegistrationViewModel.publish(MarketplaceCustomerRegistrationViewData.copy$default($r32, null, null, false, false, null, null, false, null, null, null, false, null, 4091, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: uploadFile$lambda-3  reason: not valid java name */
    public static final void m41596uploadFile$lambda3(Map map, Field field, MarketplaceCustomerRegistrationViewModel marketplaceCustomerRegistrationViewModel, UploadResponse uploadResponse) {
        Log_OC.getArray(map, "$filePropMap");
        Log_OC.getArray(field, "$field");
        Log_OC.getArray(marketplaceCustomerRegistrationViewModel, "this$0");
        FileUploadResponse $r4 = uploadResponse.getFileUploadResponse();
        String $r6 = $r4 == null ? null : $r4.getId();
        if ($r6 != null) {
            String $r62 = field.getKey();
            FileUploadResponse $r42 = uploadResponse.getFileUploadResponse();
            String $r5 = $r42 != null ? $r42.getId() : null;
            Log_OC.append($r5);
            map.put($r62, $r5);
            ViewData $r7 = marketplaceCustomerRegistrationViewModel.getState();
            MarketplaceCustomerRegistrationViewData $r8 = MarketplaceCustomerRegistrationViewData.copy$default((MarketplaceCustomerRegistrationViewData) $r7, null, null, false, false, null, null, false, null, map, null, false, null, 3775, null);
            marketplaceCustomerRegistrationViewModel.publish($r8);
            return;
        }
        String $r52 = uploadResponse.getErrorResponseMessage();
        String $r63 = $r52;
        if ($r52 == null) {
            $r63 = "Error uploading files";
        }
        Error $r9 = new Error($r63, false, 2, null);
        ViewData $r72 = marketplaceCustomerRegistrationViewModel.getState();
        MarketplaceCustomerRegistrationViewData $r82 = (MarketplaceCustomerRegistrationViewData) $r72;
        marketplaceCustomerRegistrationViewModel.publish(MarketplaceCustomerRegistrationViewData.copy$default($r82, null, null, false, false, null, null, false, $r9, null, null, false, null, 3903, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: uploadFile$lambda-4  reason: not valid java name */
    public static final void m41597uploadFile$lambda4(MarketplaceCustomerRegistrationViewModel marketplaceCustomerRegistrationViewModel, Throwable th) {
        Log_OC.getArray(marketplaceCustomerRegistrationViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default("Error uploading files", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        Error $r2 = new Error((String) $r4, false, 2, null);
        ViewData $r6 = marketplaceCustomerRegistrationViewModel.getState();
        MarketplaceCustomerRegistrationViewData $r7 = MarketplaceCustomerRegistrationViewData.copy$default((MarketplaceCustomerRegistrationViewData) $r6, null, null, false, false, null, null, false, $r2, null, null, false, null, 3903, null);
        marketplaceCustomerRegistrationViewModel.publish($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchLocation() {
        ViewData $r1 = getState();
        MarketplaceCustomerRegistrationViewData $r2 = MarketplaceCustomerRegistrationViewData.copy$default((MarketplaceCustomerRegistrationViewData) $r1, null, null, false, true, null, null, false, null, null, null, false, null, 4087, null);
        publish($r2);
        FetchLocation $r3 = this.fetchLocation;
        AbstractC11688p $r4 = $r3.execute();
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.v2.productCustomerRegistration.viewModel.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceCustomerRegistrationViewModel $r12 = MarketplaceCustomerRegistrationViewModel.this;
                List $r32 = (List) obj;
                MarketplaceCustomerRegistrationViewModel.m41590fetchLocation$lambda5($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productCustomerRegistration.viewModel.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceCustomerRegistrationViewModel $r12 = MarketplaceCustomerRegistrationViewModel.this;
                Throwable $r32 = (Throwable) obj;
                MarketplaceCustomerRegistrationViewModel.m41591fetchLocation$lambda6($r12, $r32);
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
        MarketplaceCustomerRegistrationViewData $r3 = MarketplaceCustomerRegistrationViewData.copy$default((MarketplaceCustomerRegistrationViewData) $r2, null, null, false, false, null, null, false, null, null, null, true, null, 3071, null);
        publish($r3);
        AssociatedField $r4 = this.fetchAssociatedField;
        AbstractC11688p $r5 = $r4.execute(str);
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.v2.productCustomerRegistration.viewModel.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceCustomerRegistrationViewModel $r1 = MarketplaceCustomerRegistrationViewModel.this;
                AssociatedFieldsResponseBody $r32 = (AssociatedFieldsResponseBody) obj;
                MarketplaceCustomerRegistrationViewModel.m41592getAssociatedField$lambda7($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productCustomerRegistration.viewModel.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceCustomerRegistrationViewModel $r1 = MarketplaceCustomerRegistrationViewModel.this;
                Throwable $r32 = (Throwable) obj;
                MarketplaceCustomerRegistrationViewModel.m41593getAssociatedField$lambda8($r1, $r32);
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
        MarketplaceCustomerRegistrationViewData $r3 = MarketplaceCustomerRegistrationViewData.copy$default((MarketplaceCustomerRegistrationViewData) $r2, null, null, true, false, null, null, false, null, null, null, false, null, 4091, null);
        publish($r3);
        ProductFieldsUseCase $r4 = this.fetchProductFields;
        AbstractC11688p $r5 = $r4.execute(str);
        FavoritesArrayAdapter $r6 = $r5 == null ? null : $r5.e0(new Object() { // from class: ai.kudi.agent.v2.productCustomerRegistration.viewModel.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceCustomerRegistrationViewModel $r1 = MarketplaceCustomerRegistrationViewModel.this;
                ProductFieldResponse $r32 = (ProductFieldResponse) obj;
                MarketplaceCustomerRegistrationViewModel.m41594getProductFields$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productCustomerRegistration.viewModel.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceCustomerRegistrationViewModel $r1 = MarketplaceCustomerRegistrationViewModel.this;
                Throwable $r32 = (Throwable) obj;
                MarketplaceCustomerRegistrationViewModel.m41595getProductFields$lambda1($r1, $r32);
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
        MarketplaceCustomerRegistrationViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public MarketplaceCustomerRegistrationViewData initialData() {
        MarketplaceCustomerRegistrationViewData $r1 = new MarketplaceCustomerRegistrationViewData(null, null, false, false, null, null, false, null, null, null, false, null, 4095, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void uploadFile(String str, final Field field) {
        Log_OC.getArray(str, "filePath");
        Log_OC.getArray(field, "field");
        final LinkedHashMap $r3 = new LinkedHashMap();
        ViewData $r4 = getState();
        MarketplaceCustomerRegistrationViewData $r5 = MarketplaceCustomerRegistrationViewData.copy$default((MarketplaceCustomerRegistrationViewData) $r4, null, null, false, false, null, null, true, null, null, null, false, null, 4031, null);
        publish($r5);
        FileUpload $r6 = this.fileUpload;
        AbstractC11688p $r7 = $r6.execute(str);
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.v2.productCustomerRegistration.viewModel.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                Map $r1 = $r3;
                Field $r2 = field;
                MarketplaceCustomerRegistrationViewModel $r32 = this;
                UploadResponse $r52 = (UploadResponse) obj;
                MarketplaceCustomerRegistrationViewModel.m41596uploadFile$lambda3($r1, $r2, $r32, $r52);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productCustomerRegistration.viewModel.FileFilterUtil$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                MarketplaceCustomerRegistrationViewModel $r1 = MarketplaceCustomerRegistrationViewModel.this;
                Throwable $r32 = (Throwable) obj;
                MarketplaceCustomerRegistrationViewModel.m41597uploadFile$lambda4($r1, $r32);
            }
        });
        C11280b $r11 = getCompositeDisposable();
        $r11.b($r10);
    }
}
