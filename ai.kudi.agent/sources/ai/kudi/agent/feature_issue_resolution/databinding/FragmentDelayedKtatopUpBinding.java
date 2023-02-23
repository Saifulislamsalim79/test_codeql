package ai.kudi.agent.feature_issue_resolution.databinding;

import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiRadioButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentDelayedKtatopUpBinding implements InterfaceC8209a {
    public final KudiInputField amountView;
    public final KudiInputField depositorsNameView;
    public final ImageView image1;
    public final ImageView image2;
    public final ImageView image3;
    public final AddImageViewBinding include3;
    public final AddImageViewBinding include4;
    public final AddImageViewBinding include5;
    public final LinearLayout layoutAddPics;
    public final RadioGroup radioGroup2;
    public final KudiRadioButton radioNEFT;
    public final KudiRadioButton radioNIP;
    private final ScrollView rootView;
    public final KudiInputField sendersBankView;
    public final KudiButton submitButton;
    public final TextView textView23;
    public final TextView textView24;
    public final TextView textView25;
    public final KudiInputField transactionDateView;

    private FragmentDelayedKtatopUpBinding(ScrollView scrollView, KudiInputField kudiInputField, KudiInputField kudiInputField2, ImageView imageView, ImageView imageView2, ImageView imageView3, AddImageViewBinding addImageViewBinding, AddImageViewBinding addImageViewBinding2, AddImageViewBinding addImageViewBinding3, LinearLayout linearLayout, RadioGroup radioGroup, KudiRadioButton kudiRadioButton, KudiRadioButton kudiRadioButton2, KudiInputField kudiInputField3, KudiButton kudiButton, TextView textView, TextView textView2, TextView textView3, KudiInputField kudiInputField4) {
        this.rootView = scrollView;
        this.amountView = kudiInputField;
        this.depositorsNameView = kudiInputField2;
        this.image1 = imageView;
        this.image2 = imageView2;
        this.image3 = imageView3;
        this.include3 = addImageViewBinding;
        this.include4 = addImageViewBinding2;
        this.include5 = addImageViewBinding3;
        this.layoutAddPics = linearLayout;
        this.radioGroup2 = radioGroup;
        this.radioNEFT = kudiRadioButton;
        this.radioNIP = kudiRadioButton2;
        this.sendersBankView = kudiInputField3;
        this.submitButton = kudiButton;
        this.textView23 = textView;
        this.textView24 = textView2;
        this.textView25 = textView3;
        this.transactionDateView = kudiInputField4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentDelayedKtatopUpBinding bind(View view) {
        int $i0 = C0214R.C0216id.amountView;
        View $r1 = view.findViewById($i0);
        KudiInputField kudiInputField = (KudiInputField) $r1;
        if (kudiInputField != null) {
            $i0 = C0214R.C0216id.depositorsNameView;
            View $r12 = view.findViewById($i0);
            KudiInputField kudiInputField2 = (KudiInputField) $r12;
            if (kudiInputField2 != null) {
                $i0 = C0214R.C0216id.image1;
                View $r13 = view.findViewById($i0);
                ImageView imageView = (ImageView) $r13;
                if (imageView != null) {
                    $i0 = C0214R.C0216id.image2;
                    View $r14 = view.findViewById($i0);
                    ImageView imageView2 = (ImageView) $r14;
                    if (imageView2 != null) {
                        $i0 = C0214R.C0216id.image3;
                        View $r15 = view.findViewById($i0);
                        ImageView imageView3 = (ImageView) $r15;
                        if (imageView3 != null) {
                            $i0 = C0214R.C0216id.include3;
                            View $r16 = view.findViewById($i0);
                            if ($r16 != null) {
                                AddImageViewBinding $r7 = AddImageViewBinding.bind($r16);
                                $i0 = C0214R.C0216id.include4;
                                View $r17 = view.findViewById($i0);
                                if ($r17 != null) {
                                    AddImageViewBinding $r8 = AddImageViewBinding.bind($r17);
                                    $i0 = C0214R.C0216id.include5;
                                    View $r18 = view.findViewById($i0);
                                    if ($r18 != null) {
                                        AddImageViewBinding $r9 = AddImageViewBinding.bind($r18);
                                        $i0 = C0214R.C0216id.layout_add_pics;
                                        View $r19 = view.findViewById($i0);
                                        LinearLayout $r10 = (LinearLayout) $r19;
                                        if ($r10 != null) {
                                            $i0 = C0214R.C0216id.radioGroup2;
                                            View $r110 = view.findViewById($i0);
                                            RadioGroup $r11 = (RadioGroup) $r110;
                                            if ($r11 != null) {
                                                $i0 = C0214R.C0216id.radio_NEFT;
                                                View $r111 = view.findViewById($i0);
                                                KudiRadioButton $r122 = (KudiRadioButton) $r111;
                                                if ($r122 != null) {
                                                    $i0 = C0214R.C0216id.radio_NIP;
                                                    View $r112 = view.findViewById($i0);
                                                    KudiRadioButton $r132 = (KudiRadioButton) $r112;
                                                    if ($r132 != null) {
                                                        $i0 = C0214R.C0216id.sendersBankView;
                                                        View $r113 = view.findViewById($i0);
                                                        KudiInputField $r142 = (KudiInputField) $r113;
                                                        if ($r142 != null) {
                                                            $i0 = C0214R.C0216id.submitButton;
                                                            View $r114 = view.findViewById($i0);
                                                            KudiButton $r152 = (KudiButton) $r114;
                                                            if ($r152 != null) {
                                                                $i0 = C0214R.C0216id.textView23;
                                                                View $r115 = view.findViewById($i0);
                                                                TextView $r162 = (TextView) $r115;
                                                                if ($r162 != null) {
                                                                    $i0 = C0214R.C0216id.textView24;
                                                                    View $r116 = view.findViewById($i0);
                                                                    TextView $r172 = (TextView) $r116;
                                                                    if ($r172 != null) {
                                                                        $i0 = C0214R.C0216id.textView25;
                                                                        View $r117 = view.findViewById($i0);
                                                                        TextView $r182 = (TextView) $r117;
                                                                        if ($r182 != null) {
                                                                            $i0 = C0214R.C0216id.transactionDateView;
                                                                            View $r118 = view.findViewById($i0);
                                                                            KudiInputField $r192 = (KudiInputField) $r118;
                                                                            if ($r192 != null) {
                                                                                ScrollView $r21 = (ScrollView) view;
                                                                                FragmentDelayedKtatopUpBinding $r20 = new FragmentDelayedKtatopUpBinding($r21, kudiInputField, kudiInputField2, imageView, imageView2, imageView3, $r7, $r8, $r9, $r10, $r11, $r122, $r132, $r142, $r152, $r162, $r172, $r182, $r192);
                                                                                return $r20;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Resources $r22 = view.getResources();
        String $r23 = $r22.getResourceName($i0);
        NullPointerException $r24 = new NullPointerException("Missing required view with ID: ".concat($r23));
        throw $r24;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentDelayedKtatopUpBinding inflate(LayoutInflater layoutInflater) {
        FragmentDelayedKtatopUpBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentDelayedKtatopUpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int $i0 = C0214R.C0217layout.fragment_delayed_ktatop_up;
        View $r2 = layoutInflater.inflate($i0, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentDelayedKtatopUpBinding $r3 = bind($r2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public /* bridge */ /* synthetic */ View getRoot() {
        ScrollView $r1 = getRoot();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p201g.p270x.InterfaceC8209a
    public ScrollView getRoot() {
        ScrollView r1 = this.rootView;
        return r1;
    }
}
