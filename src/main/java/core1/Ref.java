package core1;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class Ref {

    public static void main(String[] args) {
        Object object = new Object();
//        SoftReference<Object> softReference = new SoftReference<>(object);
        WeakReference<Object> weakReference = new WeakReference<>(object);
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Object> phantomReference = new PhantomReference<>(object, referenceQueue);

        object = null;

        System.out.println("Try");
        System.gc();
        System.out.println("End");

        System.out.println(object);
//        System.out.println(softReference.get());
        System.out.println(weakReference.get());
        System.out.println(phantomReference.get());
        System.out.println(referenceQueue.poll());

    }

}
