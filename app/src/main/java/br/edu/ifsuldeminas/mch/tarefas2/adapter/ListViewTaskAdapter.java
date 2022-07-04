package br.edu.ifsuldeminas.mch.tarefas2.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.edu.ifsuldeminas.mch.tarefas2.R;
import br.edu.ifsuldeminas.mch.tarefas2.domain.Category;
import br.edu.ifsuldeminas.mch.tarefas2.domain.Task;

public class ListViewTaskAdapter extends BaseAdapter {

    private final List<Task> tasks;
    private final Activity act;

    public ListViewTaskAdapter(List<Task> tasks, Activity act) {
        this.tasks = tasks;
        this.act = act;
    }

    @Override
    public int getCount() {
        return tasks.size();
    }

    @Override
    public Object getItem(int position) {
        return tasks.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.list_view_task_adapter, parent, false);

        Task task = tasks.get(position);

        TextView nome = (TextView)
                view.findViewById(R.id.lista_curso_personalizada_nome);
        TextView descricao = (TextView)
                view.findViewById(R.id.lista_curso_personalizada_descricao);
        ImageView imagem = (ImageView)
                view.findViewById(R.id.lista_curso_personalizada_imagem);

        nome.setText(task.getDescription());
        descricao.setText(task.getCategory().getName());
        imagem.setImageResource(R.drawable.ic_baseline_label_24);

        return view;
    }
}
