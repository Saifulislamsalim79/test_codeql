package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.databinding.FragmentUpgradeAccountBinding;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: UpgradeAccountFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/view/View;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.UpgradeAccountFragment$onViewCreated$2$3 */
/* loaded from: classes.dex */
final class UpgradeAccountFragment$onViewCreated$2$3 extends AbstractC11802m implements InterfaceC11767l<View, C13666w> {
    final /* synthetic */ FragmentUpgradeAccountBinding $this_apply;
    final /* synthetic */ UpgradeAccountFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UpgradeAccountFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "id", "", "<anonymous parameter 1>"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.personal.ui.UpgradeAccountFragment$onViewCreated$2$3$1 */
    /* loaded from: classes.dex */
    public static final class C05291 extends AbstractC11802m implements InterfaceC11771p<String, String, C13666w> {
        final /* synthetic */ FragmentUpgradeAccountBinding $this_apply;
        final /* synthetic */ UpgradeAccountFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05291(UpgradeAccountFragment upgradeAccountFragment, FragmentUpgradeAccountBinding fragmentUpgradeAccountBinding) {
            super(2);
            this.this$0 = upgradeAccountFragment;
            this.$this_apply = fragmentUpgradeAccountBinding;
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
            Log_OC.getArray(str2, "$noName_1");
            UpgradeAccountFragment $r3 = this.this$0;
            $r3.picUrl = str;
            FragmentUpgradeAccountBinding $r4 = this.$this_apply;
            KudiInputField $r5 = $r4.picUrlView;
            UpgradeAccountFragment $r32 = this.this$0;
            String $r1 = $r32.getString(C0001R.string.file_upload_complete);
            $r5.setText($r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeAccountFragment$onViewCreated$2$3(UpgradeAccountFragment upgradeAccountFragment, FragmentUpgradeAccountBinding fragmentUpgradeAccountBinding) {
        super(1);
        this.this$0 = upgradeAccountFragment;
        this.$this_apply = fragmentUpgradeAccountBinding;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(View view) {
        View $r2 = view;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        Log_OC.getArray(view, "it");
        CameraFragment $r4 = new CameraFragment();
        UpgradeAccountFragment $r6 = this.this$0;
        FragmentUpgradeAccountBinding $r1 = this.$this_apply;
        C05291 $r5 = new C05291($r6, $r1);
        $r4.setOnPictureTakenListener($r5);
        UpgradeAccountFragment $r62 = this.this$0;
        FragmentManager $r2 = $r62.getChildFragmentManager();
        $r4.show($r2, "Take Pic");
    }
}
