#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * ${robotName} generated free by NoraUi Organization https://github.com/NoraUi
 * ${robotName} is licensed under the license BSD.
 * 
 * CAUTION: ${robotName} use NoraUi library. This project is licensed under the license GNU AFFERO GENERAL PUBLIC LICENSE
 */
package ${package}.application.model.${targetApplicationId};

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.github.noraui.application.model.DemosModel;
import com.github.noraui.model.Model;
import com.github.noraui.model.ModelList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Logos extends DemosModel<Logo> implements ModelList {

    /**
     *
     */
    private static final long serialVersionUID = 9002528163560746878L;

    public Logos() {
        super();
    }

    public Logos(DemosModel<Logo> inputList) {
        super(inputList);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deserialize(String jsonString) {
        Type listType = new TypeToken<ArrayList<Logo>>() {
        }.getType();

        final GsonBuilder builder = new GsonBuilder();
        builder.excludeFieldsWithoutExposeAnnotation();
        final Gson gson = builder.create();

        List<Logo> list = gson.fromJson(jsonString, listType);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setNid(i + 1);
        }
        this.addAll(list);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ModelList addModel(Model m) {
        super.add((Logo) m);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void subtract(ModelList list) {
        Iterator<?> iterator = ((Logos) list).iterator();
        while (iterator.hasNext()) {
            this.remove(iterator.next());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Integer> getIds() {
        List<Integer> result = new ArrayList<>();
        for (Logo logo : this) {
            result.add(logo.getNid());
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (Logo logo : this) {
            s.append(logo.toString());
            s.append(",");
        }
        s.deleteCharAt(s.length());
        s.append("]");
        return s.toString();
    }

}
