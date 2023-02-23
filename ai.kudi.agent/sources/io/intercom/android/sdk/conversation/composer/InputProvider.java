package io.intercom.android.sdk.conversation.composer;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.intercom.composer.input.Input;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class InputProvider extends Fragment {
    private final List<Input> inputs;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public InputProvider() {
        ArrayList $r1 = new ArrayList();
        this.inputs = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void addInputs(List list) {
        List $r2 = this.inputs;
        $r2.addAll(list);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public List getInputs() {
        List r1 = this.inputs;
        return r1;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
