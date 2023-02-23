package ai.kudi.agent.p036v2.productAllCollectionFields.viewModel;

import ai.kudi.agent.core.domain.data.ProductField;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.p036v2.common.domain.package_3.AssociatedFieldsResponseBody;
import ai.kudi.agent.p036v2.common.domain.package_3.ProductFieldResponse;
import ai.kudi.agent.p036v2.common.domain.usecases.AssociatedField;
import ai.kudi.agent.p036v2.common.domain.usecases.FileUpload;
import ai.kudi.agent.p036v2.common.view.viewData.data.Error;
import ai.kudi.agent.p036v2.productAllCollectionFields.viewData.ProductAllCollectionFieldsViewData;
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
/* compiled from: ProductAllCollectionFieldsViewModel.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0005\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0016\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/v2/productAllCollectionFields/viewModel/ProductAllCollectionFieldsViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/v2/productAllCollectionFields/viewData/ProductAllCollectionFieldsViewData;", "fetchProductFields", "Lai/kudi/agent/v2/productDetails/domain/usecases/ProductFieldsUseCase;", "fetchLocation", "Lai/kudi/agent/register/domain/usecases/FetchLocation;", "fileUpload", "Lai/kudi/agent/v2/common/domain/usecases/FileUpload;", "fetchAssociatedField", "Lai/kudi/agent/v2/common/domain/usecases/AssociatedField;", "(Lai/kudi/agent/v2/productDetails/domain/usecases/ProductFieldsUseCase;Lai/kudi/agent/register/domain/usecases/FetchLocation;Lai/kudi/agent/v2/common/domain/usecases/FileUpload;Lai/kudi/agent/v2/common/domain/usecases/AssociatedField;)V", "", "getAssociatedField", "id", "", "getProductFields", "productId", "initialData", "uploadFile", "filePath", "field", "Lai/kudi/dip/library/bottomSheets/models/Field;", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productAllCollectionFields.viewModel.ProductAllCollectionFieldsViewModel */
/* loaded from: classes.dex */
public final class ProductAllCollectionFieldsViewModel extends BaseViewModel<ProductAllCollectionFieldsViewData> {
    private final AssociatedField fetchAssociatedField;
    private final FetchLocation fetchLocation;
    private final ProductFieldsUseCase fetchProductFields;
    private final FileUpload fileUpload;

    public ProductAllCollectionFieldsViewModel(ProductFieldsUseCase productFieldsUseCase, FetchLocation fetchLocation, FileUpload fileUpload, AssociatedField associatedField) {
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
    /* renamed from: fetchLocation$lambda-3  reason: not valid java name */
    public static final void m41566fetchLocation$lambda3(ProductAllCollectionFieldsViewModel productAllCollectionFieldsViewModel, List list) {
        Log_OC.getArray(productAllCollectionFieldsViewModel, "this$0");
        ViewData $r2 = productAllCollectionFieldsViewModel.getState();
        Log_OC.loadImage(list, "it");
        ProductAllCollectionFieldsViewData $r3 = ProductAllCollectionFieldsViewData.copy$default((ProductAllCollectionFieldsViewData) $r2, null, null, false, false, list, null, false, null, null, null, false, null, 4071, null);
        productAllCollectionFieldsViewModel.publish($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchLocation$lambda-4  reason: not valid java name */
    public static final void m41567fetchLocation$lambda4(ProductAllCollectionFieldsViewModel productAllCollectionFieldsViewModel, Throwable th) {
        Log_OC.getArray(productAllCollectionFieldsViewModel, "this$0");
        ViewData $r3 = productAllCollectionFieldsViewModel.getState();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Error Fetching location", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        Error $r2 = new Error((String) $r6, false, 2, null);
        ProductAllCollectionFieldsViewData $r4 = ProductAllCollectionFieldsViewData.copy$default((ProductAllCollectionFieldsViewData) $r3, null, null, false, false, null, $r2, false, null, null, null, false, null, 4063, null);
        productAllCollectionFieldsViewModel.publish($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getAssociatedField$lambda-7  reason: not valid java name */
    public static final void m41568getAssociatedField$lambda7(ProductAllCollectionFieldsViewModel productAllCollectionFieldsViewModel, AssociatedFieldsResponseBody associatedFieldsResponseBody) {
        Log_OC.getArray(productAllCollectionFieldsViewModel, "this$0");
        String $r2 = associatedFieldsResponseBody.getResponseMessage();
        if ($r2 != null) {
            ViewData $r3 = productAllCollectionFieldsViewModel.getState();
            String $r22 = associatedFieldsResponseBody.getResponseMessage();
            Error $r5 = new Error($r22, false, 2, null);
            ProductAllCollectionFieldsViewData $r4 = ProductAllCollectionFieldsViewData.copy$default((ProductAllCollectionFieldsViewData) $r3, null, null, false, false, null, null, false, null, null, null, false, $r5, 1023, null);
            productAllCollectionFieldsViewModel.publish($r4);
        }
        List $r6 = associatedFieldsResponseBody.getProductFields();
        if ($r6 != null) {
            List $r62 = associatedFieldsResponseBody.getProductFields();
            ViewData $r32 = productAllCollectionFieldsViewModel.getState();
            ProductAllCollectionFieldsViewData $r42 = (ProductAllCollectionFieldsViewData) $r32;
            productAllCollectionFieldsViewModel.publish(ProductAllCollectionFieldsViewData.copy$default($r42, null, null, false, false, null, null, false, null, null, $r62, false, null, 2559, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getAssociatedField$lambda-8  reason: not valid java name */
    public static final void m41569getAssociatedField$lambda8(ProductAllCollectionFieldsViewModel productAllCollectionFieldsViewModel, Throwable th) {
        Log_OC.getArray(productAllCollectionFieldsViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default("Error fetching associated fields", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        Error $r2 = new Error((String) $r4, false, 2, null);
        ViewData $r6 = productAllCollectionFieldsViewModel.getState();
        ProductAllCollectionFieldsViewData $r7 = ProductAllCollectionFieldsViewData.copy$default((ProductAllCollectionFieldsViewData) $r6, null, $r2, false, false, null, null, false, null, null, null, false, null, 3069, null);
        productAllCollectionFieldsViewModel.publish($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getProductFields$lambda-0  reason: not valid java name */
    public static final void m41570getProductFields$lambda0(ProductAllCollectionFieldsViewModel productAllCollectionFieldsViewModel, ProductFieldResponse productFieldResponse) {
        Log_OC.getArray(productAllCollectionFieldsViewModel, "this$0");
        ProductField $r2 = productFieldResponse == null ? null : productFieldResponse.getProductField();
        if ($r2 != null) {
            ViewData $r3 = productAllCollectionFieldsViewModel.getState();
            ProductField $r22 = productFieldResponse.getProductField();
            ProductAllCollectionFieldsViewData $r4 = ProductAllCollectionFieldsViewData.copy$default((ProductAllCollectionFieldsViewData) $r3, $r22, null, false, false, null, null, false, null, null, null, false, null, 4090, null);
            productAllCollectionFieldsViewModel.publish($r4);
        }
        String $r5 = productFieldResponse == null ? null : productFieldResponse.getResponseMessage();
        if ($r5 != null) {
            ViewData $r32 = productAllCollectionFieldsViewModel.getState();
            ProductAllCollectionFieldsViewData $r42 = (ProductAllCollectionFieldsViewData) $r32;
            String $r52 = productFieldResponse.getResponseMessage();
            Error $r6 = new Error($r52, false, 2, null);
            productAllCollectionFieldsViewModel.publish(ProductAllCollectionFieldsViewData.copy$default($r42, null, $r6, false, false, null, null, false, null, null, null, false, null, 4089, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getProductFields$lambda-1  reason: not valid java name */
    public static final void m41571getProductFields$lambda1(ProductAllCollectionFieldsViewModel productAllCollectionFieldsViewModel, Throwable th) {
        Log_OC.getArray(productAllCollectionFieldsViewModel, "this$0");
        ViewData $r3 = productAllCollectionFieldsViewModel.getState();
        InterfaceC11767l $r5 = KudiErrorParserKt.parseHttpError2$default("Error loading details", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r6 = $r5.invoke(th);
        Error $r2 = new Error((String) $r6, false, 2, null);
        ProductAllCollectionFieldsViewData $r4 = ProductAllCollectionFieldsViewData.copy$default((ProductAllCollectionFieldsViewData) $r3, null, $r2, false, false, null, null, false, null, null, null, false, null, 4089, null);
        productAllCollectionFieldsViewModel.publish($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: uploadFile$lambda-5  reason: not valid java name */
    public static final void m41572uploadFile$lambda5(Map map, Field field, ProductAllCollectionFieldsViewModel productAllCollectionFieldsViewModel, UploadResponse uploadResponse) {
        Log_OC.getArray(map, "$filePropMap");
        Log_OC.getArray(field, "$field");
        Log_OC.getArray(productAllCollectionFieldsViewModel, "this$0");
        FileUploadResponse $r4 = uploadResponse.getFileUploadResponse();
        String $r6 = $r4 == null ? null : $r4.getId();
        if ($r6 != null) {
            String $r62 = field.getKey();
            FileUploadResponse $r42 = uploadResponse.getFileUploadResponse();
            String $r5 = $r42 != null ? $r42.getId() : null;
            Log_OC.append($r5);
            map.put($r62, $r5);
            ViewData $r7 = productAllCollectionFieldsViewModel.getState();
            ProductAllCollectionFieldsViewData $r8 = ProductAllCollectionFieldsViewData.copy$default((ProductAllCollectionFieldsViewData) $r7, null, null, false, false, null, null, false, null, map, null, false, null, 3775, null);
            productAllCollectionFieldsViewModel.publish($r8);
            return;
        }
        String $r52 = uploadResponse.getErrorResponseMessage();
        String $r63 = $r52;
        if ($r52 == null) {
            $r63 = "Error uploading file";
        }
        Error $r9 = new Error($r63, false, 2, null);
        ViewData $r72 = productAllCollectionFieldsViewModel.getState();
        ProductAllCollectionFieldsViewData $r82 = (ProductAllCollectionFieldsViewData) $r72;
        productAllCollectionFieldsViewModel.publish(ProductAllCollectionFieldsViewData.copy$default($r82, null, null, false, false, null, null, false, $r9, null, null, false, null, 3903, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: uploadFile$lambda-6  reason: not valid java name */
    public static final void m41573uploadFile$lambda6(ProductAllCollectionFieldsViewModel productAllCollectionFieldsViewModel, Throwable th) {
        Log_OC.getArray(productAllCollectionFieldsViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default("Error uploading files", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        Error $r2 = new Error((String) $r4, false, 2, null);
        ViewData $r6 = productAllCollectionFieldsViewModel.getState();
        ProductAllCollectionFieldsViewData $r7 = ProductAllCollectionFieldsViewData.copy$default((ProductAllCollectionFieldsViewData) $r6, null, null, false, false, null, null, false, $r2, null, null, false, null, 3903, null);
        productAllCollectionFieldsViewModel.publish($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchLocation() {
        ViewData $r1 = getState();
        ProductAllCollectionFieldsViewData $r2 = ProductAllCollectionFieldsViewData.copy$default((ProductAllCollectionFieldsViewData) $r1, null, null, false, true, null, null, false, null, null, null, false, null, 4087, null);
        publish($r2);
        FetchLocation $r3 = this.fetchLocation;
        AbstractC11688p $r4 = $r3.execute();
        FavoritesArrayAdapter $r7 = $r4.e0(new Object() { // from class: ai.kudi.agent.v2.productAllCollectionFields.viewModel.InBandBytestreamSession$IBBDataPacketFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductAllCollectionFieldsViewModel $r12 = ProductAllCollectionFieldsViewModel.this;
                List $r32 = (List) obj;
                ProductAllCollectionFieldsViewModel.m41566fetchLocation$lambda3($r12, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productAllCollectionFields.viewModel.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductAllCollectionFieldsViewModel $r12 = ProductAllCollectionFieldsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ProductAllCollectionFieldsViewModel.m41567fetchLocation$lambda4($r12, $r32);
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
        ProductAllCollectionFieldsViewData $r3 = ProductAllCollectionFieldsViewData.copy$default((ProductAllCollectionFieldsViewData) $r2, null, null, false, false, null, null, false, null, null, null, true, null, 3071, null);
        publish($r3);
        AssociatedField $r4 = this.fetchAssociatedField;
        AbstractC11688p $r5 = $r4.execute(str);
        FavoritesArrayAdapter $r8 = $r5.e0(new Object() { // from class: ai.kudi.agent.v2.productAllCollectionFields.viewModel.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductAllCollectionFieldsViewModel $r1 = ProductAllCollectionFieldsViewModel.this;
                AssociatedFieldsResponseBody $r32 = (AssociatedFieldsResponseBody) obj;
                ProductAllCollectionFieldsViewModel.m41568getAssociatedField$lambda7($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productAllCollectionFields.viewModel.Tools$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductAllCollectionFieldsViewModel $r1 = ProductAllCollectionFieldsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ProductAllCollectionFieldsViewModel.m41569getAssociatedField$lambda8($r1, $r32);
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
        ProductAllCollectionFieldsViewData $r3 = ProductAllCollectionFieldsViewData.copy$default((ProductAllCollectionFieldsViewData) $r2, null, null, true, false, null, null, false, null, null, null, false, null, 4091, null);
        publish($r3);
        ProductFieldsUseCase $r4 = this.fetchProductFields;
        AbstractC11688p $r5 = $r4.execute(str);
        FavoritesArrayAdapter $r6 = $r5 == null ? null : $r5.e0(new Object() { // from class: ai.kudi.agent.v2.productAllCollectionFields.viewModel.Chunk
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductAllCollectionFieldsViewModel $r1 = ProductAllCollectionFieldsViewModel.this;
                ProductFieldResponse $r32 = (ProductFieldResponse) obj;
                ProductAllCollectionFieldsViewModel.m41570getProductFields$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productAllCollectionFields.viewModel.IOUtils$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductAllCollectionFieldsViewModel $r1 = ProductAllCollectionFieldsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ProductAllCollectionFieldsViewModel.m41571getProductFields$lambda1($r1, $r32);
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
        ProductAllCollectionFieldsViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public ProductAllCollectionFieldsViewData initialData() {
        ProductAllCollectionFieldsViewData $r1 = new ProductAllCollectionFieldsViewData(null, null, false, false, null, null, false, null, null, null, false, null, 4095, null);
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
        ProductAllCollectionFieldsViewData $r5 = ProductAllCollectionFieldsViewData.copy$default((ProductAllCollectionFieldsViewData) $r4, null, null, false, false, null, null, true, null, null, null, false, null, 4031, null);
        publish($r5);
        FileUpload $r6 = this.fileUpload;
        AbstractC11688p $r7 = $r6.execute(str);
        FavoritesArrayAdapter $r10 = $r7.e0(new Object() { // from class: ai.kudi.agent.v2.productAllCollectionFields.viewModel.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                Map $r1 = $r3;
                Field $r2 = field;
                ProductAllCollectionFieldsViewModel $r32 = this;
                UploadResponse $r52 = (UploadResponse) obj;
                ProductAllCollectionFieldsViewModel.m41572uploadFile$lambda5($r1, $r2, $r32, $r52);
            }
        }, new Object() { // from class: ai.kudi.agent.v2.productAllCollectionFields.viewModel.Socks5BytestreamRequest
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                ProductAllCollectionFieldsViewModel $r1 = ProductAllCollectionFieldsViewModel.this;
                Throwable $r32 = (Throwable) obj;
                ProductAllCollectionFieldsViewModel.m41573uploadFile$lambda6($r1, $r32);
            }
        });
        C11280b $r11 = getCompositeDisposable();
        $r11.b($r10);
    }
}
