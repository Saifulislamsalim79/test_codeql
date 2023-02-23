package ai.kudi.agent.p036v2.common.view.fragment;

import ai.kudi.agent.collections.R$string;
import ai.kudi.dip.library.bottomSheets.models.Field;
import ai.kudi.dip.library.button.C0768g;
import android.content.Context;
import java.util.Map;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseMarketplaceLookupFragment.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\n"}, m10421d2 = {"<anonymous>", "", "VM", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "State", "Lai/kudi/agent/core/mvvm/ViewData;", "id", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.fragment.BaseMarketplaceLookupFragment$showCamera$1 */
/* loaded from: classes.dex */
public final class BaseMarketplaceLookupFragment$showCamera$1 extends AbstractC11802m implements InterfaceC11771p<String, String, C13666w> {
    final /* synthetic */ Field $field;
    final /* synthetic */ C0768g $imageUploadButton;
    final /* synthetic */ BaseMarketplaceLookupFragment<VM, State> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarketplaceLookupFragment$showCamera$1(BaseMarketplaceLookupFragment baseMarketplaceLookupFragment, Field field, C0768g c0768g) {
        super(2);
        this.this$0 = baseMarketplaceLookupFragment;
        this.$field = field;
        this.$imageUploadButton = c0768g;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public /* bridge */ /* synthetic */ C13666w invoke(String str, String str2) {
        String $r3 = str;
        String $r4 = str2;
        invoke2($r3, $r4);
        C13666w r5 = C13666w.f30112a;
        return r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        Log_OC.getArray(str, "id");
        Log_OC.getArray(str2, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        BaseMarketplaceLookupFragment $r3 = this.this$0;
        Map $r4 = $r3.mapOfProperties;
        Field $r5 = this.$field;
        String $r6 = $r5.getKey();
        $r4.put($r6, str);
        BaseMarketplaceLookupFragment $r32 = this.this$0;
        Map $r42 = $r32.mapOfSummary;
        Field $r52 = this.$field;
        String $r62 = $r52.getName();
        String $r7 = Log_OC.m10359a("Image ID: ", (Object) str);
        $r42.put($r62, $r7);
        BaseMarketplaceLookupFragment $r33 = this.this$0;
        C0768g $r8 = this.$imageUploadButton;
        $r33.setIconImage($r8, str2);
        C0768g $r82 = this.$imageUploadButton;
        String $r1 = Log_OC.m10359a("Image ID: ", (Object) str);
        BaseMarketplaceLookupFragment $r34 = this.this$0;
        Context $r9 = $r34.requireContext();
        int $i0 = R$string.change_image;
        String $r2 = $r9.getString($i0);
        Log_OC.loadImage($r2, "requireContext().getString(R.string.change_image)");
        $r82.m38015l(true, $r1, $r2);
        BaseMarketplaceLookupFragment $r35 = this.this$0;
        $r35.handleEnableButton();
    }
}
