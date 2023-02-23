package ai.kudi.agent.kshock.p009ui.adapter;

import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.feature_kshock.databinding.ListItemKShockEligibilityCriteriaBinding;
import ai.kudi.agent.feature_kshock.databinding.ListItemKShockEligibilityCriteriaWithProgressBinding;
import ai.kudi.agent.kshock.data.model.EligibilityProgress;
import ai.kudi.agent.kshock.data.model.KshockEligibilityCriteria;
import ai.kudi.agent.kshock.p009ui.adapter.KShockEligibilityCriteriaAdapter;
import ai.kudi.agent.settings.data.Constants;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13275r;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13726r;
/* compiled from: KShockEligibilityCriteriaAdapter.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004\u001b\u001c\u001d\u001eB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u001c\u0010\u0015\u001a\u00020\u00052\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/adapter/KShockEligibilityCriteriaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/kshock/ui/adapter/KShockEligibilityCriteriaAdapter$ViewHolder;", "clickListener", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getClickListener", "()Lkotlin/jvm/functions/Function0;", "value", "", "Lai/kudi/agent/kshock/data/model/KshockEligibilityCriteria;", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "CriteriaWithProgressViewHolder", "CriteriaWithoutProgressViewHolder", "ViewHolder", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.adapter.KShockEligibilityCriteriaAdapter */
/* loaded from: classes.dex */
public final class KShockEligibilityCriteriaAdapter extends RecyclerView.AbstractC1623h<ViewHolder> {
    public static final Companion Companion;
    private static final String VERIFY_BVN_INFO = "Click to verify BVN";
    private static final int VIEW_CRITERIA = 1;
    private static final int VIEW_PROGRESSIVE_CRITERIA = 0;
    private final InterfaceC11756a<C13666w> clickListener;
    private List<KshockEligibilityCriteria> items;

    /* compiled from: KShockEligibilityCriteriaAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/adapter/KShockEligibilityCriteriaAdapter$Companion;", "", "()V", "VERIFY_BVN_INFO", "", "VIEW_CRITERIA", "", "VIEW_PROGRESSIVE_CRITERIA", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.adapter.KShockEligibilityCriteriaAdapter$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: KShockEligibilityCriteriaAdapter.kt */
    @Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\tH\u0003J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/adapter/KShockEligibilityCriteriaAdapter$CriteriaWithProgressViewHolder;", "Lai/kudi/agent/kshock/ui/adapter/KShockEligibilityCriteriaAdapter$ViewHolder;", "Lai/kudi/agent/kshock/ui/adapter/KShockEligibilityCriteriaAdapter;", "binding", "Lai/kudi/agent/feature_kshock/databinding/ListItemKShockEligibilityCriteriaWithProgressBinding;", "(Lai/kudi/agent/kshock/ui/adapter/KShockEligibilityCriteriaAdapter;Lai/kudi/agent/feature_kshock/databinding/ListItemKShockEligibilityCriteriaWithProgressBinding;)V", "eligibilityCheckBox", "Landroid/widget/CheckBox;", "eligibilityProgressBar", "Landroid/widget/SeekBar;", "layout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "legendLabelText", "Landroid/widget/TextView;", "legendValueText", "progressBarCurrentLabel", "progressBarStartLabel", "bindData", "", "eligibilityCriteria", "Lai/kudi/agent/kshock/data/model/KshockEligibilityCriteria;", "disableSeekBarDrag", "sb", "positionText", "seekBar", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.adapter.KShockEligibilityCriteriaAdapter$CriteriaWithProgressViewHolder */
    /* loaded from: classes.dex */
    public final class CriteriaWithProgressViewHolder extends ViewHolder {
        private final ListItemKShockEligibilityCriteriaWithProgressBinding binding;
        private final CheckBox eligibilityCheckBox;
        private final SeekBar eligibilityProgressBar;
        private final ConstraintLayout layout;
        private final TextView legendLabelText;
        private final TextView legendValueText;
        private final TextView progressBarCurrentLabel;
        private final TextView progressBarStartLabel;
        final /* synthetic */ KShockEligibilityCriteriaAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public CriteriaWithProgressViewHolder(ai.kudi.agent.kshock.p009ui.adapter.KShockEligibilityCriteriaAdapter r8, ai.kudi.agent.feature_kshock.databinding.ListItemKShockEligibilityCriteriaWithProgressBinding r9) {
            /*
                r7 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r8, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r9, r0)
                r7.this$0 = r8
                androidx.constraintlayout.widget.ConstraintLayout r1 = r9.getRoot()
                java.lang.String r0 = "binding.root"
                kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)
                r3 = r1
                android.view.View r3 = (android.view.View) r3
                r2 = r3
                r7.<init>(r8, r2)
                r7.binding = r9
                android.widget.CheckBox r4 = r9.eligibilityCheckBox
                java.lang.String r0 = "binding.eligibilityCheckBox"
                kotlin.p483e0.p485d.Log_OC.loadImage(r4, r0)
                r7.eligibilityCheckBox = r4
                ai.kudi.agent.feature_kshock.databinding.ListItemKShockEligibilityCriteriaWithProgressBinding r9 = r7.binding
                android.widget.TextView r5 = r9.currentValueLabel
                java.lang.String r0 = "binding.currentValueLabel"
                kotlin.p483e0.p485d.Log_OC.loadImage(r5, r0)
                r7.legendLabelText = r5
                ai.kudi.agent.feature_kshock.databinding.ListItemKShockEligibilityCriteriaWithProgressBinding r9 = r7.binding
                android.widget.TextView r5 = r9.currentValueText
                java.lang.String r0 = "binding.currentValueText"
                kotlin.p483e0.p485d.Log_OC.loadImage(r5, r0)
                r7.legendValueText = r5
                ai.kudi.agent.feature_kshock.databinding.ListItemKShockEligibilityCriteriaWithProgressBinding r9 = r7.binding
                android.widget.SeekBar r6 = r9.eligibilityProgressBar
                java.lang.String r0 = "binding.eligibilityProgressBar"
                kotlin.p483e0.p485d.Log_OC.loadImage(r6, r0)
                r7.eligibilityProgressBar = r6
                ai.kudi.agent.feature_kshock.databinding.ListItemKShockEligibilityCriteriaWithProgressBinding r9 = r7.binding
                android.widget.TextView r5 = r9.progressStartLabel
                java.lang.String r0 = "binding.progressStartLabel"
                kotlin.p483e0.p485d.Log_OC.loadImage(r5, r0)
                r7.progressBarStartLabel = r5
                ai.kudi.agent.feature_kshock.databinding.ListItemKShockEligibilityCriteriaWithProgressBinding r9 = r7.binding
                android.widget.TextView r5 = r9.progressCurrentLabel
                java.lang.String r0 = "binding.progressCurrentLabel"
                kotlin.p483e0.p485d.Log_OC.loadImage(r5, r0)
                r7.progressBarCurrentLabel = r5
                ai.kudi.agent.feature_kshock.databinding.ListItemKShockEligibilityCriteriaWithProgressBinding r9 = r7.binding
                androidx.constraintlayout.widget.ConstraintLayout r1 = r9.kshockEligibilityCriteriaWithPrrogressLayout
                java.lang.String r0 = "binding.kshockEligibilityCriteriaWithPrrogressLayout"
                kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)
                r7.layout = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.p009ui.adapter.KShockEligibilityCriteriaAdapter.CriteriaWithProgressViewHolder.<init>(ai.kudi.agent.kshock.ui.adapter.KShockEligibilityCriteriaAdapter, ai.kudi.agent.feature_kshock.databinding.ListItemKShockEligibilityCriteriaWithProgressBinding):void");
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void disableSeekBarDrag(SeekBar seekBar) {
            View$OnTouchListenerC0290b $r2 = View$OnTouchListenerC0290b.f566e;
            seekBar.setOnTouchListener($r2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: disableSeekBarDrag$lambda-1  reason: not valid java name */
        public static final boolean m39632disableSeekBarDrag$lambda1(View view, MotionEvent motionEvent) {
            return true;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        private final void positionText(final SeekBar seekBar) {
            ViewGroup $r4 = this.layout;
            ViewGroup r6 = $r4;
            ViewTreeObserver $r3 = r6.getViewTreeObserver();
            $r3.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ai.kudi.agent.kshock.ui.adapter.MainActivity$10
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    SeekBar $r1 = seekBar;
                    KShockEligibilityCriteriaAdapter.CriteriaWithProgressViewHolder $r2 = this;
                    KShockEligibilityCriteriaAdapter.CriteriaWithProgressViewHolder.m39633positionText$lambda0($r1, $r2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: positionText$lambda-0  reason: not valid java name */
        public static final void m39633positionText$lambda0(SeekBar seekBar, CriteriaWithProgressViewHolder criteriaWithProgressViewHolder) {
            Log_OC.getArray(seekBar, "$seekBar");
            Log_OC.getArray(criteriaWithProgressViewHolder, "this$0");
            Drawable $r2 = seekBar.getThumb();
            Rect $r3 = $r2.getBounds();
            int $i0 = $r3.left;
            Drawable $r22 = seekBar.getThumb();
            int $i1 = $r22.getIntrinsicWidth();
            TextView $r4 = criteriaWithProgressViewHolder.progressBarCurrentLabel;
            float $f0 = $i0 - $i1;
            $r4.setTranslationX($f0);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
        @Override // ai.kudi.agent.kshock.p009ui.adapter.KShockEligibilityCriteriaAdapter.ViewHolder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void bindData(ai.kudi.agent.kshock.data.model.KshockEligibilityCriteria r17) {
            /*
                Method dump skipped, instructions count: 237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.p009ui.adapter.KShockEligibilityCriteriaAdapter.CriteriaWithProgressViewHolder.bindData(ai.kudi.agent.kshock.data.model.KshockEligibilityCriteria):void");
        }
    }

    /* compiled from: KShockEligibilityCriteriaAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/adapter/KShockEligibilityCriteriaAdapter$CriteriaWithoutProgressViewHolder;", "Lai/kudi/agent/kshock/ui/adapter/KShockEligibilityCriteriaAdapter$ViewHolder;", "Lai/kudi/agent/kshock/ui/adapter/KShockEligibilityCriteriaAdapter;", "binding", "Lai/kudi/agent/feature_kshock/databinding/ListItemKShockEligibilityCriteriaBinding;", "(Lai/kudi/agent/kshock/ui/adapter/KShockEligibilityCriteriaAdapter;Lai/kudi/agent/feature_kshock/databinding/ListItemKShockEligibilityCriteriaBinding;)V", "bindData", "", "eligibilityCriteria", "Lai/kudi/agent/kshock/data/model/KshockEligibilityCriteria;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.adapter.KShockEligibilityCriteriaAdapter$CriteriaWithoutProgressViewHolder */
    /* loaded from: classes.dex */
    public final class CriteriaWithoutProgressViewHolder extends ViewHolder {
        private final ListItemKShockEligibilityCriteriaBinding binding;
        final /* synthetic */ KShockEligibilityCriteriaAdapter this$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public CriteriaWithoutProgressViewHolder(ai.kudi.agent.kshock.p009ui.adapter.KShockEligibilityCriteriaAdapter r3, ai.kudi.agent.feature_kshock.databinding.ListItemKShockEligibilityCriteriaBinding r4) {
            /*
                r2 = this;
                java.lang.String r0 = "this$0"
                kotlin.p483e0.p485d.Log_OC.getArray(r3, r0)
                java.lang.String r0 = "binding"
                kotlin.p483e0.p485d.Log_OC.getArray(r4, r0)
                r2.this$0 = r3
                android.widget.FrameLayout r1 = r4.getRoot()
                java.lang.String r0 = "binding.root"
                kotlin.p483e0.p485d.Log_OC.loadImage(r1, r0)
                r2.<init>(r3, r1)
                r2.binding = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.kshock.p009ui.adapter.KShockEligibilityCriteriaAdapter.CriteriaWithoutProgressViewHolder.<init>(ai.kudi.agent.kshock.ui.adapter.KShockEligibilityCriteriaAdapter, ai.kudi.agent.feature_kshock.databinding.ListItemKShockEligibilityCriteriaBinding):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: bindData$lambda-1$lambda-0  reason: not valid java name */
        public static final void m39634bindData$lambda1$lambda0(KShockEligibilityCriteriaAdapter kShockEligibilityCriteriaAdapter, View view) {
            Log_OC.getArray(kShockEligibilityCriteriaAdapter, "this$0");
            InterfaceC11756a $r0 = kShockEligibilityCriteriaAdapter.getClickListener();
            $r0.invoke();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // ai.kudi.agent.kshock.p009ui.adapter.KShockEligibilityCriteriaAdapter.ViewHolder
        public void bindData(KshockEligibilityCriteria kshockEligibilityCriteria) {
            boolean $z0;
            boolean $z02;
            Log_OC.getArray(kshockEligibilityCriteria, "eligibilityCriteria");
            ListItemKShockEligibilityCriteriaBinding $r3 = this.binding;
            final KShockEligibilityCriteriaAdapter $r1 = this.this$0;
            CheckBox $r4 = $r3.eligibilityCheckBox;
            boolean $z03 = kshockEligibilityCriteria.getStatus();
            $r4.setChecked($z03);
            CheckBox $r42 = $r3.eligibilityCheckBox;
            String $r5 = kshockEligibilityCriteria.getLabel();
            $r42.setText($r5);
            TextView $r6 = $r3.descriptionText;
            String $r52 = kshockEligibilityCriteria.getDescription();
            $r6.setText($r52);
            boolean $z04 = kshockEligibilityCriteria.getStatus();
            if (!$z04) {
                String $r53 = kshockEligibilityCriteria.getLabel();
                $z02 = C13277t.m5425H($r53, "KYC", true);
                if ($z02) {
                    TextView $r62 = $r3.actionToComplete;
                    Log_OC.loadImage($r62, "actionToComplete");
                    ViewExtKt.show($r62);
                    TextView $r63 = $r3.actionToComplete;
                    $r63.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.adapter.c
                        /* JADX WARN: Can't parse signature for local variable: 
                        java.lang.NullPointerException
                         */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            KShockEligibilityCriteriaAdapter $r2 = KShockEligibilityCriteriaAdapter.this;
                            KShockEligibilityCriteriaAdapter.CriteriaWithoutProgressViewHolder.m39634bindData$lambda1$lambda0($r2, view);
                        }
                    });
                }
            }
            boolean $z05 = kshockEligibilityCriteria.getStatus();
            if (!$z05) {
                String $r54 = kshockEligibilityCriteria.getLabel();
                $z0 = C13277t.m5425H($r54, Constants.IS_BVN_VERIFIED, true);
                if ($z0) {
                    TextView $r64 = $r3.actionToComplete;
                    Log_OC.loadImage($r64, "actionToComplete");
                    ViewExtKt.show($r64);
                    TextView $r65 = $r3.actionToComplete;
                    $r65.setText(KShockEligibilityCriteriaAdapter.VERIFY_BVN_INFO);
                }
            }
            TextView $r632 = $r3.actionToComplete;
            $r632.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.kshock.ui.adapter.c
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KShockEligibilityCriteriaAdapter $r2 = KShockEligibilityCriteriaAdapter.this;
                    KShockEligibilityCriteriaAdapter.CriteriaWithoutProgressViewHolder.m39634bindData$lambda1$lambda0($r2, view);
                }
            });
        }
    }

    /* compiled from: KShockEligibilityCriteriaAdapter.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b¦\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/kshock/ui/adapter/KShockEligibilityCriteriaAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/View;", "(Lai/kudi/agent/kshock/ui/adapter/KShockEligibilityCriteriaAdapter;Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "bindData", "", "eligibilityCriteria", "Lai/kudi/agent/kshock/data/model/KshockEligibilityCriteria;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.kshock.ui.adapter.KShockEligibilityCriteriaAdapter$ViewHolder */
    /* loaded from: classes.dex */
    public abstract class ViewHolder extends RecyclerView.AbstractC1620e0 {
        private final View container;
        final /* synthetic */ KShockEligibilityCriteriaAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(KShockEligibilityCriteriaAdapter kShockEligibilityCriteriaAdapter, View view) {
            super(view);
            Log_OC.getArray(kShockEligibilityCriteriaAdapter, "this$0");
            Log_OC.getArray(view, "container");
            this.this$0 = kShockEligibilityCriteriaAdapter;
            this.container = view;
        }

        public abstract void bindData(KshockEligibilityCriteria kshockEligibilityCriteria);

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        protected final View getContainer() {
            View r1 = this.container;
            return r1;
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
    public KShockEligibilityCriteriaAdapter(InterfaceC11756a interfaceC11756a) {
        List $r1;
        Log_OC.getArray(interfaceC11756a, "clickListener");
        this.clickListener = interfaceC11756a;
        $r1 = C13726r.m3891e();
        this.items = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11756a getClickListener() {
        InterfaceC11756a r1 = this.clickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.items;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemViewType(int i) {
        String $r6;
        List $r1 = this.items;
        Object $r2 = $r1.get(i);
        KshockEligibilityCriteria $r3 = (KshockEligibilityCriteria) $r2;
        EligibilityProgress $r4 = $r3.getEligibilityProgressIndicator();
        Integer $r5 = null;
        if ($r4 != null && ($r6 = $r4.getPercentProgress()) != null) {
            $r5 = C13275r.m5455k($r6);
        }
        List $r12 = this.items;
        Object $r22 = $r12.get(i);
        KshockEligibilityCriteria $r32 = (KshockEligibilityCriteria) $r22;
        boolean $z0 = $r32.getHasProgressIndicator();
        return (!$z0 || $r5 == null) ? 1 : 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getItems() {
        List r1 = this.items;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(ViewHolder viewHolder, int i) {
        Log_OC.getArray(viewHolder, "holder");
        List $r3 = this.items;
        Object $r2 = $r3.get(i);
        KshockEligibilityCriteria $r4 = (KshockEligibilityCriteria) $r2;
        viewHolder.bindData($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        ViewHolder $r2 = viewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        Context $r2 = viewGroup.getContext();
        LayoutInflater $r3 = LayoutInflater.from($r2);
        if (i == 0) {
            ListItemKShockEligibilityCriteriaWithProgressBinding $r5 = ListItemKShockEligibilityCriteriaWithProgressBinding.inflate($r3, viewGroup, false);
            Log_OC.loadImage($r5, "inflate(\n                    inflater,\n                    parent,\n                    false\n                )");
            CriteriaWithProgressViewHolder $r4 = new CriteriaWithProgressViewHolder(this, $r5);
            return $r4;
        }
        ListItemKShockEligibilityCriteriaBinding $r7 = ListItemKShockEligibilityCriteriaBinding.inflate($r3, viewGroup, false);
        Log_OC.loadImage($r7, "inflate(inflater, parent, false)");
        CriteriaWithoutProgressViewHolder $r6 = new CriteriaWithoutProgressViewHolder(this, $r7);
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    public final void setItems(List list) {
        Log_OC.getArray(list, "value");
        this.items = list;
        notifyDataSetChanged();
    }
}
