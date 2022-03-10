public class Son {

    //内部类继承Father类
    class Father_Inner extends Father{
        public int strong(){
            return super.strong()+1;
        }
    }

    //内部类继承Mother类
    class Mother_Inner extends Mother{
        public int smart(){
            return super.smart()+1;
        }
    }

    public int getStrong(){
        return new Father_Inner().strong();
    }

    public int getSmart(){
        return new Mother_Inner().smart();
    }
}
