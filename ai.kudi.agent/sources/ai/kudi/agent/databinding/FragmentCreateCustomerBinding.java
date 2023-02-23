package ai.kudi.agent.databinding;

import ai.kudi.agent.C0001R;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p201g.p270x.InterfaceC8209a;
/* loaded from: classes.dex */
public final class FragmentCreateCustomerBinding implements InterfaceC8209a {
    public final KudiButton buttonAddCustomer;
    public final ConstraintLayout containerFullName;
    public final ImageView imageCustomerLoader;
    private final ScrollView rootView;
    public final KudiInputField textFullName;
    public final TextView textInstruction;
    public final KudiInputField textPhoneNumber;

    private FragmentCreateCustomerBinding(ScrollView scrollView, KudiButton kudiButton, ConstraintLayout constraintLayout, ImageView imageView, KudiInputField kudiInputField, TextView textView, KudiInputField kudiInputField2) {
        this.rootView = scrollView;
        this.buttonAddCustomer = kudiButton;
        this.containerFullName = constraintLayout;
        this.imageCustomerLoader = imageView;
        this.textFullName = kudiInputField;
        this.textInstruction = textView;
        this.textPhoneNumber = kudiInputField2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateCustomerBinding bind(View view) {
        int $i0 = C0001R.C0003id.button_add_customer;
        View $r1 = view.findViewById(C0001R.C0003id.button_add_customer);
        KudiButton $r2 = (KudiButton) $r1;
        if ($r2 != null) {
            $i0 = C0001R.C0003id.container_full_name;
            View $r12 = view.findViewById(C0001R.C0003id.container_full_name);
            ConstraintLayout $r3 = (ConstraintLayout) $r12;
            if ($r3 != null) {
                $i0 = C0001R.C0003id.image_customer_loader;
                View $r13 = view.findViewById(C0001R.C0003id.image_customer_loader);
                ImageView imageView = (ImageView) $r13;
                if (imageView != null) {
                    $i0 = C0001R.C0003id.text_full_name;
                    View $r14 = view.findViewById(C0001R.C0003id.text_full_name);
                    KudiInputField kudiInputField = (KudiInputField) $r14;
                    if (kudiInputField != null) {
                        $i0 = C0001R.C0003id.text_instruction;
                        View $r15 = view.findViewById(C0001R.C0003id.text_instruction);
                        TextView textView = (TextView) $r15;
                        if (textView != null) {
                            $i0 = C0001R.C0003id.text_phone_number;
                            View $r16 = view.findViewById(C0001R.C0003id.text_phone_number);
                            KudiInputField kudiInputField2 = (KudiInputField) $r16;
                            if (kudiInputField2 != null) {
                                ScrollView $r9 = (ScrollView) view;
                                FragmentCreateCustomerBinding $r8 = new FragmentCreateCustomerBinding($r9, $r2, $r3, imageView, kudiInputField, textView, kudiInputField2);
                                return $r8;
                            }
                        }
                    }
                }
            }
        }
        Resources $r10 = view.getResources();
        String $r11 = $r10.getResourceName($i0);
        NullPointerException $r122 = new NullPointerException("Missing required view with ID: ".concat($r11));
        throw $r122;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateCustomerBinding inflate(LayoutInflater layoutInflater) {
        FragmentCreateCustomerBinding $r0 = inflate(layoutInflater, null, false);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static FragmentCreateCustomerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View $r2 = layoutInflater.inflate(C0001R.C0004layout.fragment_create_customer, viewGroup, false);
        if (z) {
            viewGroup.addView($r2);
        }
        FragmentCreateCustomerBinding $r3 = bind($r2);
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
