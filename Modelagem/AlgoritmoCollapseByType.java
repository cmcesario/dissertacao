Set<Object> groups = new TreeSet();
Map <String, List> groupsByTypeMap  = new TreeMap<String,List>();
groupsByTypeMap.put("branco", new ArrayList(<Set>));
groupsByTypeMap.put("verde", new ArrayList(<Set>));
groupsByTypeMap.put("amarelo", new ArrayList(<Set>));
groupsByTypeMap.put("vermelho", new ArrayList(<Set>));
groupsByTypeMap.put("cinza", new ArrayList(<Set>));
tipoAtual = "branco"
grupoAtual = new HashSet();

for (noAtual: getVertices()) {
	if (noAtual.tipo == tipoAtual) {
		if (filhos do mesmo tipo) {
			grupoAtual.add(noAtual);
		} else {
			if (grupoAtual.isEmpty()) {
				grupoAtual.add(noAtual);
				groupsByTypeMap.get(tipoAtual).add(grupoAtual);
			} else {
				groupsByTypeMap.get(tipoAtual).add(grupoAtual);
				grupoAtual = new HashSet();
				grupoAtual.add(noAtual);
				groupsByTypeMap.get(tipoAtual).add(grupoAtual);
		}
	}
}