package ai.kudi.agent.p036v2.common.view.fragment;

import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.R$string;
import ai.kudi.agent.collections.databinding.FragmentProductLookupBinding;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.image.ImageUtil;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.merchantProduct.data.FileUploadModel;
import ai.kudi.agent.merchantProduct.forms.DateInputFieldView;
import ai.kudi.agent.merchantProduct.forms.FormInputFieldView;
import ai.kudi.agent.merchantProduct.forms.ShortTextInputFieldView;
import ai.kudi.agent.p036v2.common.utils.ViewUtils_extKt;
import ai.kudi.agent.p036v2.common.view.activities.MarketplaceLookupActivity;
import ai.kudi.agent.p036v2.common.view.fragment.CameraFragment;
import ai.kudi.agent.p036v2.utils.MarketplaceProductTypes;
import ai.kudi.agent.register.data.models.LocationModel;
import ai.kudi.agent.statesandlgapicker.dialogs.StateFragment;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import ai.kudi.dip.library.bottomSheets.models.Field;
import ai.kudi.dip.library.button.AbstractC0765e;
import ai.kudi.dip.library.button.C0767f;
import ai.kudi.dip.library.button.C0768g;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.p049m.C0841a;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.core.app.C1291a;
import androidx.core.content.C1335a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: BaseMarketplaceLookupFragment.kt */
@Metadata(m10422d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u008b\u0001*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00060\u00052\u00020\u0007:\u0002\u008b\u0001B\u0005¢\u0006\u0002\u0010\bJ\b\u0010G\u001a\u00020\u0011H\u0002J\b\u0010H\u001a\u00020IH&J\u001a\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\n2\b\u0010L\u001a\u0004\u0018\u00010\nH&J.\u0010M\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010N\u001a\u00020\n2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020.0%j\b\u0012\u0004\u0012\u00020.`'H\u0002J&\u0010O\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020.0%j\b\u0012\u0004\u0012\u00020.`'H\u0002J@\u0010P\u001a\u00020I2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020\n2\u0016\u0010U\u001a\u0012\u0012\u0004\u0012\u00020\n0%j\b\u0012\u0004\u0012\u00020\n`'2\u0006\u0010V\u001a\u00020\nH\u0002J\b\u0010W\u001a\u00020IH\u0002J\b\u0010X\u001a\u00020IH\u0016J\b\u0010Y\u001a\u00020IH&J\b\u0010Z\u001a\u00020IH&J\u0018\u0010[\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020&2\u0006\u0010S\u001a\u00020\u001aH\u0002J\b\u0010]\u001a\u00020\u0011H\u0002J\"\u0010^\u001a\u00020I2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020`2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J$\u0010d\u001a\u00020&2\u0006\u0010e\u001a\u00020f2\b\u0010g\u001a\u0004\u0018\u00010h2\b\u0010i\u001a\u0004\u0018\u00010jH\u0016J+\u0010k\u001a\u00020I2\u0006\u0010_\u001a\u00020`2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\n0m2\u0006\u0010n\u001a\u00020oH\u0016¢\u0006\u0002\u0010pJ\u001a\u0010q\u001a\u00020I2\u0006\u0010\\\u001a\u00020&2\b\u0010i\u001a\u0004\u0018\u00010jH\u0016J\u0012\u0010r\u001a\u00020I2\b\u0010s\u001a\u0004\u0018\u00010\nH\u0002J@\u0010t\u001a\u00020I2\u0012\u0010u\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020:0v2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0v2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010w\u001a\u00020I2\u0006\u0010x\u001a\u00020yH\u0002J\u0018\u0010z\u001a\u00020I2\u0006\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020\nH\u0002J\b\u0010~\u001a\u00020IH&J\b\u0010\u007f\u001a\u00020IH\u0016J\u0019\u0010\u0080\u0001\u001a\u00020I2\u0006\u0010S\u001a\u00020\u001a2\u0006\u0010{\u001a\u00020|H\u0002J\u0019\u0010\u0081\u0001\u001a\u00020I2\u0006\u0010\"\u001a\u00020#2\u0006\u0010S\u001a\u00020\u001aH\u0002J\u0013\u0010\u0082\u0001\u001a\u00020I2\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0002J\u0007\u0010\u0085\u0001\u001a\u00020IJ\u0012\u0010\u0086\u0001\u001a\u00020I2\u0007\u0010\u0087\u0001\u001a\u00020\nH\u0002J\u0013\u0010\u0088\u0001\u001a\u00020I2\b\u0010\u0089\u0001\u001a\u00030\u0084\u0001H\u0002J\u0019\u0010\u008a\u0001\u001a\u00020I2\u0006\u0010!\u001a\u00020\n2\u0006\u0010S\u001a\u00020\u001aH&R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010-\u001a\u0012\u0012\u0004\u0012\u00020.0%j\b\u0012\u0004\u0012\u00020.`'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0019X¦\u000e¢\u0006\f\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u001eR*\u00102\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001903X¦\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020&03X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020:03X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n03X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010<\u001a\u0004\u0018\u00010=X¦\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010B\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010C\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010E\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010F\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u008c\u0001"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/fragment/BaseMarketplaceLookupFragment;", "VM", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "State", "Lai/kudi/agent/core/mvvm/ViewData;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/collections/databinding/FragmentProductLookupBinding;", "Lai/kudi/agent/v2/common/view/fragment/CollectionListeners;", "()V", "amountKey", "", "associatedFieldId", "getAssociatedFieldId", "()Ljava/lang/String;", "setAssociatedFieldId", "(Ljava/lang/String;)V", "buttonEnabled", "", "collectionAmount", "collectionAmountType", "getCollectionAmountType", "setCollectionAmountType", "dateFormatter", "Ljava/text/SimpleDateFormat;", "fields", "", "Lai/kudi/dip/library/bottomSheets/models/Field;", "getFields", "()Ljava/util/List;", "setFields", "(Ljava/util/List;)V", "fileField", "fileName", "filePath", "fileUploadButton", "Lai/kudi/dip/library/button/FileUploadButton;", "filledFields", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "imageName", "lga", "lgaLatitude", "", "lgaLongitude", "locationList", "Lai/kudi/agent/register/data/models/LocationModel;", "locations", "getLocations", "setLocations", "mapOfAssociatedFields", "", "getMapOfAssociatedFields", "()Ljava/util/Map;", "setMapOfAssociatedFields", "(Ljava/util/Map;)V", "mapOfFields", "mapOfProperties", "", "mapOfSummary", "marketplaceLookupActivity", "Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "getMarketplaceLookupActivity", "()Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;", "setMarketplaceLookupActivity", "(Lai/kudi/agent/v2/common/view/activities/MarketplaceLookupActivity;)V", "multiChoiceSelections", "multiDropDownSelections", SendReceiptToTerminalConfirmationBottomSheet.STATE, "states", "totalFields", "askForPermissions", "fetchLocation", "", "getAssociatedFields", "id", "fieldName", "getLgaFromList", "stateLocation", "getStates", "handleAssociatedFields", "inputFieldView", "Lai/kudi/agent/merchantProduct/forms/ShortTextInputFieldView;", "field", "parentFieldKey", "associatedFieldList", "selectedAssociatedFieldName", "handleButtonClick", "handleEnableButton", "handleNavigation", "initializeData", "isInputValid", "view", "isPermissionsAllowed", "onActivityResult", "requestCode", "", "resultCode", TransactionBreakDownItemType.DATA, "Landroid/content/Intent;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "openFile", "mimeType", "performActionWithData", "propertiesMap", "", "setFile", "fileUploadModel", "Lai/kudi/agent/merchantProduct/data/FileUploadModel;", "setIconImage", "imageUploadButton", "Lai/kudi/dip/library/button/ImageUploadButton;", "imageUrl", "setToolbar", "setViews", "showCamera", "showDocuments", "showLga", "lgaField", "Lai/kudi/agent/merchantProduct/forms/FormInputFieldView;", "showLocation", "showPermissionDeniedDialog", BanksWithMethods.PACKAGE_NAME, "showStates", "stateField", "uploadFile", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.fragment.BaseMarketplaceLookupFragment */
/* loaded from: classes.dex */
public abstract class BaseMarketplaceLookupFragment<VM extends BaseViewModel<State>, State extends ViewData> extends BaseMVVMViewBindingFragment<VM, State, FragmentProductLookupBinding> implements CollectionListeners {
    public static final Companion Companion;
    private static final int FILE_REQUEST_CODE = 979;
    private static final int REQUEST_CODE_FILE_PERMISSION = 4;
    private String amountKey;
    private boolean buttonEnabled;
    private String collectionAmount;
    private final SimpleDateFormat dateFormatter;
    private Field fileField;
    private String fileName;
    private String filePath;
    private C0767f fileUploadButton;
    private final ArrayList<View> filledFields;
    private String imageName;
    private float lgaLatitude;
    private float lgaLongitude;
    private ArrayList<LocationModel> locationList;
    private Map<Field, View> mapOfFields;
    private Map<String, Object> mapOfProperties;
    private Map<String, String> mapOfSummary;
    private List<Field> multiChoiceSelections;
    private List<Field> multiDropDownSelections;
    private List<String> states;
    private final ArrayList<View> totalFields;
    private String state = "Lagos";
    private String alias = "";

    /* compiled from: BaseMarketplaceLookupFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/fragment/BaseMarketplaceLookupFragment$Companion;", "", "()V", "FILE_REQUEST_CODE", "", "REQUEST_CODE_FILE_PERMISSION", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.common.view.fragment.BaseMarketplaceLookupFragment$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseMarketplaceLookupFragment() {
        ArrayList $r2 = new ArrayList();
        this.locationList = $r2;
        this.filePath = "";
        LinkedHashMap $r3 = new LinkedHashMap();
        this.mapOfFields = $r3;
        LinkedHashMap $r32 = new LinkedHashMap();
        this.mapOfProperties = $r32;
        LinkedHashMap $r33 = new LinkedHashMap();
        this.mapOfSummary = $r33;
        this.collectionAmount = "";
        ArrayList $r22 = new ArrayList();
        this.totalFields = $r22;
        ArrayList $r23 = new ArrayList();
        this.filledFields = $r23;
        Locale $r1 = Locale.getDefault();
        SimpleDateFormat $r4 = new SimpleDateFormat("yyyy.MM.dd-HH:mm:ss z", $r1);
        this.dateFormatter = $r4;
        this.amountKey = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean askForPermissions() {
        boolean $z0 = isPermissionsAllowed();
        if ($z0) {
            return true;
        }
        FragmentActivity $r1 = requireActivity();
        boolean $z02 = C1291a.m36463t($r1, "android.permission.READ_EXTERNAL_STORAGE");
        if (!$z02) {
            FragmentActivity $r12 = requireActivity();
            String[] $r3 = {"android.permission.READ_EXTERNAL_STORAGE"};
            C1291a.m36466q($r12, $r3, 4);
            return false;
        }
        FragmentActivity $r13 = requireActivity();
        String $r2 = $r13.getPackageName();
        Log_OC.loadImage($r2, "requireActivity().packageName");
        showPermissionDeniedDialog($r2);
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:9:0x002d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List getLgaFromList(java.lang.String r11, java.util.ArrayList r12) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r12.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r3 = r1.next()
            r5 = r3
            ai.kudi.agent.register.data.models.LocationModel r5 = (ai.kudi.agent.register.data.models.LocationModel) r5
            r4 = r5
            java.lang.String r6 = r4.getStateName()
            boolean r2 = kotlin.p483e0.p485d.Log_OC.append(r6, r11)
            if (r2 == 0) goto L9
            java.util.ArrayList r12 = r4.getLga()
            java.util.Iterator r1 = r12.iterator()
        L29:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r3 = r1.next()
            r8 = r3
            ai.kudi.agent.register.data.models.LgaModel r8 = (ai.kudi.agent.register.data.models.LgaModel) r8
            r7 = r8
            float r9 = r7.getLatitude()
            r10.lgaLatitude = r9
            float r9 = r7.getLongitude()
            r10.lgaLongitude = r9
            java.lang.String r11 = r7.getLga()
            r0.add(r11)
            goto L29
        L4b:
            kotlin.p557z.C13722p.m3914t(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment.getLgaFromList(java.lang.String, java.util.ArrayList):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List getStates(java.util.ArrayList r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r8.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r3 = r1.next()
            r5 = r3
            ai.kudi.agent.register.data.models.LocationModel r5 = (ai.kudi.agent.register.data.models.LocationModel) r5
            r4 = r5
            java.lang.String r6 = r4.getStateName()
            r0.add(r6)
            goto L9
        L1f:
            kotlin.p557z.C13722p.m3914t(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment.getStates(java.util.ArrayList):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void handleAssociatedFields(ShortTextInputFieldView shortTextInputFieldView, Field field, String str, ArrayList arrayList, String str2) {
        Context $r7 = requireContext();
        Log_OC.loadImage($r7, "requireContext()");
        ShortTextInputFieldView r17 = new ShortTextInputFieldView($r7, null, 0, 6, null);
        String $r8 = field.getAssociationChildTitle();
        String $r9 = $r8;
        if ($r8 == null) {
            $r9 = field.getName();
        }
        r17.setLabel($r9);
        String $r92 = field.getAssociationChildHint();
        String $r82 = $r92;
        if ($r92 == null) {
            String $r93 = field.getHint();
            $r82 = $r93;
            if ($r93 == null) {
                $r82 = "Associated field";
            }
        }
        r17.setInputHint($r82);
        boolean $z0 = field.getRequired();
        r17.setRequired($z0);
        r17.disableEditablity();
        ShortTextInputFieldView r20 = r17;
        r20.setEnabled(true);
        int $i0 = field.getId();
        getAssociatedFields(String.valueOf($i0), str2);
        BaseMarketplaceLookupFragment$handleAssociatedFields$2 r18 = new BaseMarketplaceLookupFragment$handleAssociatedFields$2(this, field, r17, arrayList, str);
        r17.setClickedListener(r18);
        InterfaceC8209a $r11 = requireBinding();
        FragmentProductLookupBinding $r12 = (FragmentProductLookupBinding) $r11;
        LinearLayout $r13 = $r12.llProductLookupWrapper;
        ShortTextInputFieldView r21 = shortTextInputFieldView;
        int $i02 = $r13.indexOfChild(r21);
        Map $r14 = this.mapOfFields;
        $r14.put(field, r17);
        InterfaceC8209a $r112 = requireBinding();
        FragmentProductLookupBinding $r122 = (FragmentProductLookupBinding) $r112;
        LinearLayout $r132 = $r122.llProductLookupWrapper;
        ShortTextInputFieldView r212 = r17;
        $r132.addView(r212, $i02 + 1);
        EditText $r15 = r17.getEditText();
        BaseMarketplaceLookupFragment$handleAssociatedFields$3 r19 = new BaseMarketplaceLookupFragment$handleAssociatedFields$3(this);
        ViewUtils_extKt.textChanges$default($r15, null, null, r19, 3, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0015 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleButtonClick() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment.handleButtonClick():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (r0 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isInputValid(android.view.View r14, ai.kudi.dip.library.bottomSheets.models.Field r15) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof ai.kudi.agent.merchantProduct.forms.FormInputFieldView
            if (r0 == 0) goto L52
            r2 = r14
            ai.kudi.agent.merchantProduct.forms.FormInputFieldView r2 = (ai.kudi.agent.merchantProduct.forms.FormInputFieldView) r2
            r1 = r2
            boolean r0 = r1.validate()
            if (r0 == 0) goto L1d
            java.lang.String r3 = r15.getName()
            java.lang.String r4 = " is required"
            java.lang.String r3 = kotlin.p483e0.p485d.Log_OC.m10359a(r3, r4)
            r1.setError(r3)
            r5 = 1
            return r5
        L1d:
            java.lang.String r3 = r15.getType()
            ai.kudi.agent.v2.utils.MarketplaceProductTypes r6 = ai.kudi.agent.p036v2.utils.MarketplaceProductTypes.PHONE_NUMBER
            java.lang.String r7 = r6.name()
            boolean r0 = kotlin.p483e0.p485d.Log_OC.append(r3, r7)
            if (r0 != 0) goto L3d
            java.lang.String r3 = r15.getType()
            ai.kudi.agent.v2.utils.MarketplaceProductTypes r6 = ai.kudi.agent.p036v2.utils.MarketplaceProductTypes.CUSTOMER_PHONE_NUMBER
            java.lang.String r7 = r6.name()
            boolean r0 = kotlin.p483e0.p485d.Log_OC.append(r3, r7)
            if (r0 == 0) goto L52
        L3d:
            java.lang.String r3 = r1.getText()
            boolean r0 = ai.kudi.agent.core.util.StringExtKt.isNigerianPhoneNumber(r3)
            if (r0 != 0) goto L52
            int r8 = ai.kudi.agent.collections.R$string.enter_valid_phone
            java.lang.String r3 = r13.getString(r8)
            r1.setError(r3)
            r5 = 1
            return r5
        L52:
            boolean r0 = r14 instanceof ai.kudi.dip.library.button.AbstractC0765e
            if (r0 == 0) goto L6b
            r10 = r14
            ai.kudi.dip.library.button.e r10 = (ai.kudi.dip.library.button.AbstractC0765e) r10
            r9 = r10
            boolean r0 = r9.getFinalState()
            if (r0 != 0) goto L6b
            boolean r0 = r15.getRequired()
            if (r0 == 0) goto L6b
            r9.m38021e()
            r5 = 1
            return r5
        L6b:
            boolean r0 = r14 instanceof ai.kudi.agent.merchantProduct.forms.DateInputFieldView
            if (r0 == 0) goto L88
            r12 = r14
            ai.kudi.agent.merchantProduct.forms.DateInputFieldView r12 = (ai.kudi.agent.merchantProduct.forms.DateInputFieldView) r12
            r11 = r12
            boolean r0 = r11.validate()
            if (r0 == 0) goto L88
            java.lang.String r3 = r15.getName()
            java.lang.String r4 = " is required"
            java.lang.String r3 = kotlin.p483e0.p485d.Log_OC.m10359a(r3, r4)
            r11.setError(r3)
            r5 = 1
            return r5
        L88:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment.isInputValid(android.view.View, ai.kudi.dip.library.bottomSheets.models.Field):boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isPermissionsAllowed() {
        Context $r1 = requireContext();
        int $i0 = C1335a.m36327a($r1, "android.permission.READ_EXTERNAL_STORAGE");
        return $i0 == 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openFile(String str) {
        Intent $r3 = new Intent("android.intent.action.GET_CONTENT");
        $r3.setType(str);
        $r3.addCategory("android.intent.category.OPENABLE");
        try {
            startActivityForResult(Intent.createChooser($r3, "Open file"), FILE_REQUEST_CODE);
        } catch (ActivityNotFoundException e) {
            Context $r4 = requireContext();
            Log_OC.loadImage($r4, "requireContext()");
            ContextExtKt.toast$default($r4, "Cannot open file", 0, 2, (Object) null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setFile(FileUploadModel fileUploadModel) {
        Field $r2 = fileUploadModel.getField();
        this.fileField = $r2;
        C0767f $r3 = fileUploadModel.getFileUploadButton();
        this.fileUploadButton = $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setIconImage(C0768g c0768g, String str) {
        ImageUtil.Companion $r3 = ImageUtil.Companion;
        Context $r4 = requireContext();
        Log_OC.loadImage($r4, "requireContext()");
        ImageView $r5 = c0768g.getIconImage();
        int $i0 = R$drawable.im_circle_placeholder;
        $r3.load($r4, str, $r5, $i0, $i0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setViews$lambda-13$lambda-7  reason: not valid java name */
    public static final void m41547setViews$lambda13$lambda7(BaseMarketplaceLookupFragment baseMarketplaceLookupFragment, View view) {
        Log_OC.getArray(baseMarketplaceLookupFragment, "this$0");
        baseMarketplaceLookupFragment.handleEnableButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setViews$lambda-14  reason: not valid java name */
    public static final void m41548setViews$lambda14(BaseMarketplaceLookupFragment baseMarketplaceLookupFragment, View view) {
        Log_OC.getArray(baseMarketplaceLookupFragment, "this$0");
        boolean $z0 = baseMarketplaceLookupFragment.buttonEnabled;
        if ($z0) {
            baseMarketplaceLookupFragment.handleButtonClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showCamera(Field field, C0768g c0768g) {
        ContextExtKt.hideKeyboard(this);
        CameraFragment.Companion $r3 = CameraFragment.Companion;
        CameraFragment $r4 = $r3.newInstance(true);
        BaseMarketplaceLookupFragment$showCamera$1 $r5 = new BaseMarketplaceLookupFragment$showCamera$1(this, field, c0768g);
        $r4.setOnPictureTakenListener($r5);
        FragmentManager $r6 = getChildFragmentManager();
        $r4.show($r6, "Take Pic");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showDocuments(C0767f c0767f, Field field) {
        ContextExtKt.hideKeyboard(this);
        FileUploadModel $r2 = new FileUploadModel(c0767f, field);
        setFile($r2);
        openFile("*/*");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLga(FormInputFieldView formInputFieldView) {
        ContextExtKt.hideKeyboard(this);
        String $r3 = this.state;
        int $i0 = $r3.length();
        boolean $z0 = $i0 == 0;
        if ($z0) {
            FragmentActivity $r4 = requireActivity();
            Log_OC.loadImage($r4, "requireActivity()");
            ContextExtKt.toast$default($r4, "Please select a state first", 0, 2, (Object) null);
            return;
        }
        StateFragment.Companion $r5 = StateFragment.Companion;
        String $r32 = this.state;
        ArrayList $r1 = this.locationList;
        List $r6 = getLgaFromList($r32, $r1);
        StateFragment $r7 = StateFragment.Companion.newInstance$default($r5, $r6, null, 2, null);
        BaseMarketplaceLookupFragment$showLga$1 $r8 = new BaseMarketplaceLookupFragment$showLga$1(formInputFieldView, this, $r7);
        $r7.setCallback($r8);
        FragmentManager $r9 = getChildFragmentManager();
        $r7.show($r9, "Select Lga");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showPermissionDeniedDialog(final String str) {
        Context $r3 = requireContext();
        DialogInterfaceC0936d.C0937a $r2 = new DialogInterfaceC0936d.C0937a($r3);
        $r2.setTitle("Permission Denied").setMessage("Permission is denied, Please allow permissions from App Settings.").setPositiveButton("App Settings", new DialogInterface.OnClickListener() { // from class: ai.kudi.agent.v2.common.view.fragment.NoteEditor$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                String $r22 = str;
                BaseMarketplaceLookupFragment $r32 = this;
                BaseMarketplaceLookupFragment.m41549showPermissionDeniedDialog$lambda16($r22, $r32, dialogInterface, i);
            }
        }).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showPermissionDeniedDialog$lambda-16  reason: not valid java name */
    public static final void m41549showPermissionDeniedDialog$lambda16(String str, BaseMarketplaceLookupFragment baseMarketplaceLookupFragment, DialogInterface dialogInterface, int i) {
        Log_OC.getArray(str, "$packageName");
        Log_OC.getArray(baseMarketplaceLookupFragment, "this$0");
        Intent $r4 = new Intent();
        $r4.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        Uri $r1 = Uri.fromParts("package", str, null);
        $r4.setData($r1);
        baseMarketplaceLookupFragment.startActivity($r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showStates(FormInputFieldView formInputFieldView) {
        ContextExtKt.hideKeyboard(this);
        List $r2 = this.states;
        if ($r2 == null) {
            return;
        }
        StateFragment.Companion $r3 = StateFragment.Companion;
        StateFragment $r4 = StateFragment.Companion.newInstance$default($r3, $r2, null, 2, null);
        BaseMarketplaceLookupFragment$showStates$1$1 $r5 = new BaseMarketplaceLookupFragment$showStates$1$1(this, formInputFieldView, $r4);
        $r4.setCallback($r5);
        FragmentManager $r6 = getChildFragmentManager();
        $r4.show($r6, "Select State");
    }

    public abstract void fetchLocation();

    public abstract String getAssociatedFieldId();

    public abstract void getAssociatedFields(String str, String str2);

    public abstract String getCollectionAmountType();

    public abstract List getFields();

    public abstract List getLocations();

    public abstract Map getMapOfAssociatedFields();

    public abstract MarketplaceLookupActivity getMarketplaceLookupActivity();

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.CollectionListeners
    public void handleEnableButton() {
        boolean $z1;
        Map $r1 = this.mapOfFields;
        Set $r2 = $r1.entrySet();
        Iterator $r3 = $r2.iterator();
        while (true) {
            boolean $z0 = $r3.hasNext();
            if (!$z0) {
                break;
            }
            Object $r4 = $r3.next();
            Map.Entry $r5 = (Map.Entry) $r4;
            Object $r42 = $r5.getKey();
            Field $r6 = (Field) $r42;
            Object $r43 = $r5.getValue();
            View $r7 = (View) $r43;
            boolean $z02 = $r6.getRequired();
            if ($z02) {
                String $r8 = $r6.getType();
                MarketplaceProductTypes $r9 = MarketplaceProductTypes.MULTIPLE_CHOICE;
                String $r10 = $r9.name();
                boolean $z03 = Log_OC.append($r8, $r10);
                if (!$z03) {
                    ArrayList $r11 = this.totalFields;
                    boolean $z04 = $r11.contains($r7);
                    if (!$z04) {
                        ArrayList $r112 = this.totalFields;
                        $r112.add($r7);
                    }
                    String $r82 = $r6.getType();
                    MarketplaceProductTypes $r92 = MarketplaceProductTypes.DOCUMENT;
                    String $r102 = $r92.name();
                    boolean $z05 = Log_OC.append($r82, $r102);
                    if (!$z05) {
                        String $r83 = $r6.getType();
                        MarketplaceProductTypes $r93 = MarketplaceProductTypes.IMAGE;
                        String $r103 = $r93.name();
                        boolean $z06 = Log_OC.append($r83, $r103);
                        if (!$z06) {
                            String $r84 = $r6.getType();
                            MarketplaceProductTypes $r94 = MarketplaceProductTypes.DATE;
                            String $r104 = $r94.name();
                            boolean $z07 = Log_OC.append($r84, $r104);
                            if (!$z07) {
                                FormInputFieldView $r12 = (FormInputFieldView) $r7;
                                String $r85 = $r12.getText();
                                int $i0 = $r85.length();
                                boolean $z08 = $i0 > 0;
                                if ($z08) {
                                    ArrayList $r113 = this.filledFields;
                                    boolean $z09 = $r113.contains($r7);
                                    if (!$z09) {
                                        ArrayList $r114 = this.filledFields;
                                        $r114.add($r7);
                                    }
                                }
                            }
                        }
                    }
                    String $r86 = $r6.getType();
                    MarketplaceProductTypes $r95 = MarketplaceProductTypes.DATE;
                    String $r105 = $r95.name();
                    boolean $z010 = Log_OC.append($r86, $r105);
                    if ($z010) {
                        DateInputFieldView $r13 = (DateInputFieldView) $r7;
                        String $r87 = $r13.getText();
                        int $i02 = $r87.length();
                        $z1 = $i02 > 0;
                        if ($z1) {
                            ArrayList $r115 = this.filledFields;
                            if (!$r115.contains($r7)) {
                                ArrayList $r116 = this.filledFields;
                                $r116.add($r7);
                            }
                        }
                    }
                    if ($r7 instanceof AbstractC0765e) {
                        AbstractC0765e $r14 = (AbstractC0765e) $r7;
                        if ($r14.getFinalState()) {
                            ArrayList $r117 = this.filledFields;
                            if (!$r117.contains($r7)) {
                                ArrayList $r118 = this.filledFields;
                                $r118.add($r7);
                            }
                        }
                    }
                }
            }
        }
        ArrayList $r119 = this.totalFields;
        boolean $z011 = $r119.isEmpty();
        if (!$z011) {
            ArrayList $r1110 = this.filledFields;
            int $i03 = $r1110.size();
            ArrayList $r1111 = this.totalFields;
            int $i1 = $r1111.size();
            if ($i03 == $i1) {
                InterfaceC8209a $r15 = requireBinding();
                FragmentProductLookupBinding $r16 = (FragmentProductLookupBinding) $r15;
                KudiButton $r17 = $r16.tvProceedBtn;
                $r17.m38034d();
                $z1 = true;
            } else {
                InterfaceC8209a $r152 = requireBinding();
                FragmentProductLookupBinding $r162 = (FragmentProductLookupBinding) $r152;
                KudiButton $r172 = $r162.tvProceedBtn;
                $r172.m38035c();
            }
            this.buttonEnabled = $z1;
        }
    }

    public abstract void handleNavigation();

    public abstract void initializeData();

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == FILE_REQUEST_CODE && i2 == -1) {
            Uri $r2 = intent == null ? null : intent.getData();
            if (this.fileUploadButton == null || $r2 == null) {
                return;
            }
            C0841a $r4 = new C0841a();
            Context $r5 = requireContext();
            Log_OC.loadImage($r5, "requireContext()");
            String $r6 = $r4.m37889c($r5, $r2);
            Log_OC.append($r6);
            this.filePath = $r6;
            C0767f $r3 = this.fileUploadButton;
            if ($r3 != null) {
                int $i0 = R$drawable.ic_file;
                $r3.setIconImageWithDrawable($i0);
            }
            Context $r52 = requireContext();
            Log_OC.loadImage($r52, "requireContext()");
            this.fileName = ContextExtKt.getFileNameFromUri($r52, $r2);
            Field $r7 = this.fileField;
            if ($r7 != null) {
                String $r62 = this.filePath;
                Log_OC.append($r7);
                uploadFile($r62, $r7);
            }
            C0767f $r32 = this.fileUploadButton;
            if ($r32 == null) {
                return;
            }
            String $r63 = this.fileName;
            if ($r63 == null) {
                $r63 = "file";
            }
            Context $r53 = requireContext();
            int $i02 = R$string.change_file;
            String $r8 = $r53.getString($i02);
            Log_OC.loadImage($r8, "requireContext().getString(R.string.change_file)");
            $r32.m38015l(true, $r63, $r8);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentProductLookupBinding $r4 = FragmentProductLookupBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log_OC.getArray(strArr, "permissions");
        Log_OC.getArray(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 4) {
            boolean $z0 = isPermissionsAllowed();
            if ($z0) {
                return;
            }
            askForPermissions();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        setToolbar();
        initializeData();
    }

    public abstract void performActionWithData(Map map, Map map2, String str, String str2);

    public abstract void setAssociatedFieldId(String str);

    public abstract void setCollectionAmountType(String str);

    public abstract void setFields(List list);

    public abstract void setLocations(List list);

    public abstract void setMapOfAssociatedFields(Map map);

    public abstract void setMarketplaceLookupActivity(MarketplaceLookupActivity marketplaceLookupActivity);

    public abstract void setToolbar();

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:15:0x003d */
    /* JADX WARN: Incorrect condition in loop: B:97:0x098b */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0dd3  */
    /* JADX WARN: Type inference failed for: r9v4, types: [T, java.util.ArrayList] */
    @Override // ai.kudi.agent.p036v2.common.view.fragment.CollectionListeners
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setViews() {
        /*
            Method dump skipped, instructions count: 3545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.p036v2.common.view.fragment.BaseMarketplaceLookupFragment.setViews():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLocation() {
        List $r1 = getLocations();
        ArrayList $r2 = (ArrayList) $r1;
        this.locationList = $r2;
        List $r12 = getStates($r2);
        this.states = $r12;
    }

    public abstract void uploadFile(String str, Field field);
}
