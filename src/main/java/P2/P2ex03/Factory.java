package P2.P2ex03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class Factory {
	public static Factory obterFactory(String type) throws ClassNotFoundException, NoSuchMethodException, SecurityException,  IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException
    {
		Class<?> clazz = Class.forName("P2.P2ex03."+type+ "Factory");
		//Constructor<?> ctor = clazz.getConstructor(String.class);
		Object object = clazz.newInstance();
		return  (Factory) object;
        
      /*  if(type.equals("MotifWidget"))
        {
            return new MotifWidgetFactory();
        }
        else
        {
            return new QtWidgetFactory();
        }*/
   }
	public abstract Controller criarController();
}
