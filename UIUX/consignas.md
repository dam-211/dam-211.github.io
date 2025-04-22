# 📝 Consigna de Diseño en Figma


##  Estilo
- **Flat Design**: sin sombras, sin degradados, íconos simples y colores planos.
- Paleta sugerida: tonos suaves (azules, verdes, grises claros), alto contraste para datos críticos.
- Tipografía legible y moderna (ej. Inter, Roboto, SF Pro).

##  Pantallas mínimas requeridas (5)

1. **Pantalla de Inicio / Login**
   - Logo de la app
   - Campo de email y contraseña
   - Botón de inicio de sesión y/o acceso como invitado

2. **Pantalla Principal / Dashboard**
   - Último valor de glucemia registrado
   - Promedio diario/semanal
   - Botón flotante para agregar un nuevo valor

3. **Pantalla de Registro de Glucemia**
   - Campo para ingresar valor de glucemia
   - Fecha y hora (automáticas y/o editables)
   - Estado del registro (ayunas, post comida, etc.)
   - Botón para guardar

4. **Pantalla de Historial**
   - Lista de registros previos
   - Filtros por fecha y tipo de registro
   - Íconos o colores para indicar valores fuera de rango

5. **Pantalla de Perfil / Configuración**
   - Datos del usuario (nombre, email)
   - Ajustes de unidades (mg/dL o mmol/L)
   - Notificaciones y recordatorios
   - Cierre de sesión

##  Requisitos adicionales
- Todos los componentes deben ser reutilizables (usar *components* en Figma).
- El diseño debe ser adaptable a pantallas pequeñas.
- Nombres claros y orden en las capas.
- Opcional: agregar pantallas de onboarding o gráficas de evolución.


Colores Primarios y Secundarios (Tonos Suaves):

Azul Suave (Primario): #A7D1EB (Un celeste pastel, evoca calma y confianza, ideal para la interfaz general).
Verde Suave (Secundario): #BCE784 (Un verde claro y fresco, puede usarse para indicar rangos saludables o tendencias positivas).
Gris Claro (Neutro): #F0F4F8 (Un gris muy claro para fondos, contenedores o elementos sutiles de la interfaz).
Gris Medio (Neutro): #CED4DA (Un gris un poco más oscuro para texto secundario, iconos no críticos o líneas divisorias).
Colores de Alto Contraste (Datos Críticos):

Rojo Intenso (Alto): #E63946 (Un rojo vibrante para indicar niveles altos de glucemia o situaciones de alerta).
Amarillo Alerta (Bajo): #F4A261 (Un naranja amarillento para señalar niveles bajos de glucemia o advertencias).
Azul Oscuro (Texto/Énfasis): #2B6777 (Un azul más profundo para el texto principal, números importantes y elementos interactivos que necesiten destacar sobre los fondos claros).
Colores Adicionales (Opcionales):

Verde Oscuro (Saludable/Éxito): #43AA8B (Un verde más intenso para confirmaciones, indicadores de éxito o rangos óptimos).
Gris Oscuro (Contraste Fuerte para Texto): #495057 (Un gris oscuro para texto muy importante o gráficos donde se necesite máxima legibilidad sobre fondos claros).
Ejemplos de Uso en la Interfaz:

Fondo General: #F0F4F8 (Gris Claro)
Barra de Navegación/Encabezados: #A7D1EB (Azul Suave)
Texto Principal: #2B6777 (Azul Oscuro)
Texto Secundario/Etiquetas: #CED4DA (Gris Medio)
Nivel de Glucemia Alto: Texto y/o indicador en #E63946 (Rojo Intenso) sobre fondo #F0F4F8 (Gris Claro) o dentro de un contenedor #FDE2E2 (un rojo muy claro como fondo de énfasis).
Nivel de Glucemia Bajo: Texto y/o indicador en #F4A261 (Amarillo Alerta) sobre fondo #F0F4F8 (Gris Claro) o dentro de un contenedor #FFE5D9 (un naranja muy claro como fondo de énfasis).
Rango de Glucemia Saludable: Puede destacarse con un sutil fondo #E8F5E9 (un verde muy claro) y el valor en #43AA8B (Verde Oscuro) o simplemente el valor en #43AA8B sobre el fondo general.
Gráficos: Utilizar #BCE784 (Verde Suave) para tendencias positivas, #E63946 (Rojo Intenso) para valores altos y #F4A261 (Amarillo Alerta) para valores bajos, con ejes y etiquetas en #495057 (Gris Oscuro) para buen contraste.
Botones Primarios: Fondo #A7D1EB (Azul Suave) y texto #FFFFFF (Blanco) o #2B6777 (Azul Oscuro).
Botones Secundarios/Deshabilitados: Fondo #CED4DA (Gris Medio) y texto #6C757D (Gris más oscuro).
